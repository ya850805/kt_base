package com.jason.s2

//在函數中定義參數是函數的函數
fun main() {
    //寫法一：
    loginAPI("Jason", "123456", {msg, code -> println("最終登入的情況：$msg, code=$code")})
}

/**
 * 模擬數據庫的用戶和密碼
 */
const val USER_NAME = "Jason"
const val USER_PWD = "123456"

/**
 * 模擬前端登入call API
 */
fun loginAPI(userName: String, userPwd: String, responseResult: (String, Int) -> Unit) {
    if(userName == null || userPwd == null) TODO("用戶或密碼為空") //出現問題，終止程序

    if(userName.length > 3 && userPwd.length > 3) {
        if(webServiceLoginAPI(userName, userPwd)) {
            //登入成功
            //返回成功信息等等...
            responseResult("login success", 200)
        } else {
            //登入失敗
            //返回失敗信息等等
            responseResult("login error", 400)
        }
    } else {
        TODO("用戶帳密不合規")
    }
}

fun webServiceLoginAPI(name: String, pwd: String): Boolean {
    return name == USER_NAME && pwd == USER_PWD;
}

