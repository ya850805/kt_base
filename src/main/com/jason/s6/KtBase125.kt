package com.jason.s6

//Kotlin語言的變換函數flatMap
fun main() {
    val list = listOf("Jason", "Juan", "Tom", "Marry")
    list.map {
        "你的姓名是：$it"
    }.map {
        "{$it}"
    }.forEach(::println)

    println()

    val list2 = listOf(listOf("Jason", "Jason1"), listOf("Juan", "Juan1"), listOf("Tom", "Tom1"), listOf("Marry", "Marry1"))
    list2.flatMap {
        it.asIterable()
    }.forEach(::println)
}

/**
 * map() {it == 每一個元素 T (String, Int, Boolean, Char)} -> 把每一個元素(單一元素，String, Int ...)加到新集合
 * flatMap() {it == 每一個元素 T (集合1, 集合2, 集合3)} -> 把每一個元素(每一個元素是一個集合)加到新集合
 *
 * flatMap相當於 List<List<String>> 集合的集合，有嵌套關係
 */