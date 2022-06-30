package com.jason.s2

//Kotlin語言的==和===比較操作
fun main() {
    /**
     *  ==: 值 內容的比較，相當於java的equals
     *  ===: 引用的比較
     */

    val name1 = "Jason"
    val name2 = "Jason"

    /**
     * name1.equals(name2) 等價於 name1 == name2 都是屬於值 內容的比較
     */
    println(name1.equals(name2))
    println(name1 == name2)

    /**
     * 引用的比較，name1和name2都是指向字串池的"Jason"字串
     */
    println(name1 === name2)

    val name3 = "jason".capitalize()
    println(name3 === name1)
}