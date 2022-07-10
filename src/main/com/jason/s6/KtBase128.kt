package com.jason.s6

//Kotlin語言中使用函數式編程
fun main() {
    /**
     * 1. 定義name集合
     */
    val names = listOf("Jason", "Juan", "Tom", "Marry")

    /**
     * 2. 定義age集合
     */
    val ages = listOf(25, 26, 30, 35)

    /**
     * 3. 合併以上兩個集合
     * 4. 添加詳細內容，方便輸出
     * 5. 輸出
     */
    names.zip(ages).toMap().map {
        "your name: ${it.key}, your age: ${it.value}"
    }.forEach {
        println(it)
    }
}

