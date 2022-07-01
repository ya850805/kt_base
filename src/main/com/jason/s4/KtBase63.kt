package com.jason.s4

//Kotlin語言的可變Set集合
fun main() {
    val set = mutableSetOf("Jason", "Juan", "Tom")
    set += "Marry"
    set += "Candy"
    set -= "Marry"
    set.add("Vincent")
    set.remove("Tom")
    println(set)
}