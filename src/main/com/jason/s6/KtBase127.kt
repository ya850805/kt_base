package com.jason.s6

//Kotlin語言的合併函數zip
fun main() {
    val names = listOf("Jason", "Juan", "Tom", "Marry", "Jason")
    val ages = listOf(25, 26, 30, 35, 25)

    /**
     * 第一個集合&第二個集合 合併起來，創建新集合並返回
     */
    val zip: List<Pair<String, Int>> = names.zip(ages)
    println(zip)
    println(zip.toMap())
    println(zip.toSet())

    println()

    zip.forEach {
        /**
         * it是Pair<String, Int>
         */
        println("name=${it.first}, age=${it.second}")
    }

    println()

    /**
     * 解構Map
     */
    zip.toMap().forEach { (k, v) ->
        println("name: $k, age: $v")
    }
}