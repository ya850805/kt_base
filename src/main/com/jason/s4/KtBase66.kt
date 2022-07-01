package com.jason.s4

//Kotlin語言的Map創建
fun main() {
    /**
     * 類型為 Map<String, Double>
     */
    val map = mapOf("Jason" to 10.0, "Juan" to 5.3)
    println(map)

    /**
     * 類型為 Map<String, Int>
     */
    val map1 = mapOf(Pair("Jason", 1), Pair("Juan", 6), Pair("Jason", 10))
    println(map1)
}