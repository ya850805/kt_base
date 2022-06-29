package com.jason.s2

//Kotlin語言的函數內聯學習
fun main() {
    //寫法二：在Kotlin裡面，最後一個參數是函數時，可以把他提取到小括號外面
    loginAPI3("Jason", "1234567") { msg: String, code: Int ->
        println("最終登入的情況：$msg, code=$code")
    }
}

/**
 * 模擬數據庫的用戶和密碼
 */
const val USER_NAME3 = "Jason"
const val USER_PWD3 = "123456"

/**
 * 模擬前端登入call API
 * 若函數使用lambda作為參數，就需要聲明使用內聯
 * 若此函數不使用內聯，在調用端就會生成多個物件來完成lambda的調用(造成性能損耗)
 */
inline fun loginAPI3(userName: String, userPwd: String, responseResult: (String, Int) -> Unit) {
    if(userName == null || userPwd == null) TODO("用戶或密碼為空") //出現問題，終止程序

    if(userName.length > 3 && userPwd.length > 3) {
        if(webServiceLoginAPI3(userName, userPwd)) {
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

fun webServiceLoginAPI3(name: String, pwd: String): Boolean {
    return name == USER_NAME3 && pwd == USER_PWD3;
}