package com.jason.s2

const val INFO = "JasonIsMyName"

//Kotlin語言的substring
fun main() {
    val index = INFO.indexOf('I')

    /**
     * 兩者打印相同
     */
    println(INFO.substring(0, index))
    println(INFO.substring(0 until index)) //較推薦的寫法
}