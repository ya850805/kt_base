package com.jason.s2

const val TEXT = "Jason,Juan,Tom,Marry"

//Kotlin語言的`split`
fun main() {
    /**
     * 使用split會返回List(自動類型推斷)
     */
    val list = TEXT.split(",")

    /**
     * 直接輸出list
     */
    println(list)

    /**
     * Kotlin解構賦值
     */
    val (v1, v2, v3, v4) = list
    println("v1=$v1, v2=$v2, v3=$v3, v4=$v4")
}