package com.jason.s3

//Kotlin語法中異常處理與自定義異常特點
fun main() {
    try {
        var info: String? = null
        
        checkException(info)
        
        println(info!!.length)
    } catch (e: Exception) {
        println("錯誤：$e")
    }
}

fun checkException(info: String?) {
    info ?: throw CustomException()
}

class CustomException: RuntimeException("代碼異常")