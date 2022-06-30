package com.jason.s2

//Kotlin語言中的let內置函數
/**
 * let():
 * 1. let返回類型，是根據匿名函數最後一行的變化而變化
 * 2. let匿名函數裡面持有的是it，it就是call let()函數的物件本身
 */
fun main() {
    /**
     * 普通方式，集合第一個元素自己相加
     */
    val list = listOf(6, 5, 2, 3, 5, 7)
    val value1 = list.first() //第一個元素
    val result1 = value1 + value1
    println(result1)

    /**
     * let方式，集合第一個元素自己相加
     */
    val result2 = listOf(6, 5, 2, 3, 5, 7).let {
        /**
         * it在這邊就是該List集合
         * let匿名函數的最後一行會作為返回值
         */
        it.first() + it.first()
    }
    println(result2)

    println("===================================")

    /**
     * 普通方式，對值判斷null並返回
     */
    println(getMethod("Jason"))

    /**
     * let方式+空合併操作符，對值判斷null並返回
     */
    println(getMethodUseLet(null))
}

fun getMethod(value: String?) = if(value == null) "value is null" else "Hi $value"

fun getMethodUseLet(value: String?): String {
    return value?.let {
        "Hi $it"
    } ?: "value is null"
}