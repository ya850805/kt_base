package com.jason.s6

//Kotlin語言的超類上定義擴展函數
fun main() {
    ResponseResult("Login success!", 200).showPrintContent()

    "Jason".showPrintContent()

    val number1 = 12345
    number1.showPrintContent()

    val number2 = 566.7
    number2.showPrintContent()

    val number3 = 5.9f
    number3.showPrintContent()

    val sex = 'M'
    sex.showPrintContent()

    println()

    /**
     * 鏈式調用
     */
    "Juan".showPrintContent2().showPrintContent2().showPrintContent2()
}

/**
 * 對最超類Any進行擴展，所有類都有該方法
 *
 * 若Kotlin的內置函數被我們重複定義，屬於覆蓋，而且優先使用我們自己定義的擴展函數
 */
fun Any.showPrintContent() = println("內容是：$this")
fun Any.showPrintContent2(): Any {
    println("2內容是：$this")

    return this
}

data class ResponseResult(val msg: String, val code: Int)
