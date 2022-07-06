package com.jason.s6

//Kotlin語言中的定義擴展文件
fun main() {
    val list = listOf("Jason", "Juan", "John", "Marry")
    val set = setOf(1.2, 3.6, 0.5)

    /**
     * 不使用擴展文件
     */
    println(list.shuffled().first())
    println(set.shuffled().first())

    println()

    /**
     * 使用擴展文件
     */
    println(list.randomItem())
    println(set.randomItem())
    list.randomItemPrint()
    set.randomItemPrint()
}