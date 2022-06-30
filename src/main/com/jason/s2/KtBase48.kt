package com.jason.s2

//Kotlin語言中數字類型的安全轉換函數
fun main() {
    val number: Int = "666".toInt()
    println(number)

    /**
     * NumberFormatException，字符串裡面放入了Double類型，無法轉換成Int
     */
//    val number1: Int = "666.6".toInt()
//    println(number1)

    /**
     * 解決辦法：使用toIntOrNull()
     * 有字符串有整型相關的轉換，盡量使用toIntOrNull()函數
     */
    val number2: Int? = "666.6".toIntOrNull()
    println(number2)
}