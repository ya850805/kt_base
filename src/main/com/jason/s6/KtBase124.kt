package com.jason.s6

//Kotlin語言的變換函數map
fun main() {
    val list = listOf("Jason", "Juan", "Tom")

    /**
     * 將匿名函數最後一行的返回值，加入一個新的集合，並且返回新集合
     */
    val list2 = list.map {
        /**
         * it就是List中的每一個元素
         */
        "[$it]"
    }
    println(list2)

    /**
     * 最後直接調用forEach
     */
    list.map {
        "姓名=$it"
    }.map {
        "$it, 文字的長度是：${it.length}"
    }.map {
        "{$it}"
    }.forEach {
        println(it)
    }
}