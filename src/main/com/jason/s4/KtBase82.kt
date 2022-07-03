package com.jason.s4

//Kotlin語言的初始化陷阱三學習
fun main() {
    println("內容的長度是：${KtBase82("Jason").content.length}")
}

class KtBase82(_info: String) {
    /**
     * 當調用getInfo1()函數且該函數使用info變量時，info變量還沒有賦值，因此會有NullPointerException
     */
//    val content = getInfo1()
//    val info = _info
//    fun getInfo1() = info

    val info = _info
    val content = getInfo1()
    fun getInfo1() = info
}