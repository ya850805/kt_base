package com.jason.s4

//Kotlin語言的初始化陷阱二學習
fun main() {
    KtBase81()
}

class KtBase81 {
    val info: String

    init {
        /**
         * 必須先初始化info再調用getInfoMethod()，否則會有NullPointerException
         */
//        getInfoMethod()
//        info = "Jason"

        info = "Jason"
        getInfoMethod()
    }

    fun getInfoMethod() {
        println("info:${info[0]}")
    }
}