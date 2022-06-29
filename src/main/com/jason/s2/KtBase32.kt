package com.jason.s2

//Kotlin語言的函數引用學習
fun main() {
    /**
     * 函數引用
     * lambda屬於函數類型的物件，需要把methodResponseResult普通函數變成函數類型的物件(函數引用)
     */
    login("Jason", "123456", ::methodResponseResult)
}

/**
 * 普通函數
 */
fun methodResponseResult(msg: String, code: Int) {
    println("登入結果為：msg: $msg, code: $code")
}

/**
 * 模擬數據庫的用戶和密碼
 */
const val USER_NAME4 = "Jason"
const val USER_PWD4 = "123456"

inline fun login(userName: String, userPwd: String, responseResult: (String, Int) -> Unit) {
    if(USER_NAME4 == userName && USER_PWD4 == userPwd) {
        responseResult("login success", 200)
    } else {
        responseResult("login error", 500)
    }
}