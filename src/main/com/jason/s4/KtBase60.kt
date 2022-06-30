package com.jason.s4

//Kotlin語言的List集合遍歷學習
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7)
    /**
     * 只是輸出list詳情，不是遍歷
     */
    println(list)

    /**
     * 第一種遍歷方式
     */
    for (i in list) {
        print("$i  ")
    }

    println()

    /**
     * 第二種遍歷方式 -> forEach()
     */
    list.forEach {
        print("$it  ")
    }

    println()

    /**
     * 第三種遍歷方式with index -> forEachIndexed()
     * 第一個參數是index，第二個參數是元素
     */
    list.forEachIndexed { index, item ->
        println("index=$index, element=$item")
    }
}