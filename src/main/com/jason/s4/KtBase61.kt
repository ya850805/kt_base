package com.jason.s4

//Kotlin語言的解構語法過濾元素學習
fun main() {
    val list = listOf("Jason", "Juan", "Tom")

    /**
     * 解構，val也可以改成var，就變成變數
     */
    val (value1, value2, value3) = list
    println("value1=$value1, value2=$value2, value3=$value3")

    /**
     * 過濾解構，可以節省一些效能
     * 只解構後兩個元素，_不是變數名，是用來過濾解構的
     */
    val (_, n2, n3) = list
    println("n2=$n2, n3=$n3")
}