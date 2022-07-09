package com.jason.s6

//Kotlin語言的過濾函數filter
fun main() {
    val nameList = listOf(
        listOf("name1", "name2", "name3"),
        listOf("name4", "name5", "name6"),
        listOf("name7", "name8", "name9")
    )

    /**
     * map() 方法體要返回一個R，因此可以是Unit
     */
    nameList.map {
        /**
         * it是nameList的每一個元素，是List<String>類型
         */
        println(it)
    }

    println()

    /**
     * flatMap() 方法體要返回一個Iterable<R>
     */
    nameList.flatMap {
        it.asIterable()
    }.forEach { println(it) }

    println()

    /**
     * filter() 過濾元素
     */
    nameList.flatMap {
        it.asIterable()
    }.filter {
        Character.getNumericValue(it[4]) % 3 == 0
    }.forEach {
        println(it)
    }
}