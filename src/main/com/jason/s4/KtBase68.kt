package com.jason.s4

//Kotlin語言的Map遍歷
fun main() {
    val map = mapOf(Pair("Jason", 123), Pair("Juan", 456), "Tom" to 500)
    /**
     * 第一種方式
     */
    map.forEach {
        /**
         * it是每個元素，是一個Map.Entry，有key和value
         */
        println("${it.key} => ${it.value}  ")
    }

    /**
     * 第二種方式
     */
    map.forEach { (k, v) ->
        println("$k -> $v  ")
    }

    /**
     * 第三種方式
     */
    for (entry in map) {
        println("${entry.key} :: ${entry.value}  ")
    }
}