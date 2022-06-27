package com.jason.s1

//正常編譯
const val PI = 3.14

//Kotlin語言的編譯時常數
/**
 * 1. 編譯時常量只能是常用的基本數據類型：String, Double, Int, Float, Long, Short, Byte, Char, Boolean
 * 2. 編譯時常量只能在函數之外定義，為什麼？Ans: 如果定義在函數之內，就必須在運行時才能調用函數賦值，何來編譯時常量一說
 * 3. 結論：編譯時常量只能在函數之外定義，就可以在編譯期間初始了
 */
fun main() {
    val info = "MyInfo" //只讀類型的變量

    //提示：修飾符const不適用於 局部變量
//    const val PI2 = 3.14
}