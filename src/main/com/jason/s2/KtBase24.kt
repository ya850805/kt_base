package com.jason.s2

//Kotlin語言的函數類型&隱式返回學習
fun main() {
    /**
     * 1. 函數輸入輸出的聲明
     */
    val methodAction : () -> String

    /**
     * 2. 對上面函數的實現
     *      匿名函數不用寫return，最後一行就是返回值
     */
    methodAction = {
        val input = 999
        "$input Jason"  //隱式返回
    }

    /**
     * 調用函數
     */
    println(methodAction())
}