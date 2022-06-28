package com.jason.s1

//Kotlin語言的Unit函數特點
fun main() {

}

/**
 * Return Unit不寫也可以，默認會有，代表無參數返回的忽略類型
 * Unit相當於Java語言的void關鍵字
 */
private fun doWork(): Unit {
    println("")
}

private fun doWork2() {
    return println("")
}