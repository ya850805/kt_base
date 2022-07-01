package com.jason.s4

//Kotlin語言的集合轉換與快捷函數學習
fun main() {
    /**
     * List可重複
     */
    val list = mutableListOf("Jason", "Jason", "Jason", "Juan", "Tom")
    println(list)

    /**
     * 使用toSet() 轉成Set去重
     */
    val set = list.toSet()
    println(set)

    /**
     * List轉Set再轉List也能去重
     */
    val list2 = list.toSet().toList()
    println(list2)

    /**
     * distinct()函數去重，distinct()內部是call .toMutableSet().toList()
     */
    val list3 = list.distinct()
    println(list3)
}