package com.jason.s3

//Kotlin語言的run內置函數
/**
 * run()
 * 1. run()函數返回類型，是根據匿名函數最後一行的變化而變化
 * 2. run()函數的匿名函數裡面持有的是this，this就是call run()函數的物件本身
 */
fun main() {
    val str = "Jason is OK"
    val r1: Float = str.run {
        5.3f
    }
    println(r1)

    /**
     * 具名函數配合run函數
     */
    str
        .run(::isLong)
        .run(::showText)
        .run(::mapText)
        .run(::println)

    /**
     * 匿名函數配合run函數
     */
    str
        .run { length > 5 }
        .run { if(this) "合格" else "不合格" }
        .run { "[$this]" }
        .run { println(this) }
}

fun isLong(str: String) = str.length > 5
fun showText(isLong: Boolean) =  if(isLong) "合格" else "不合格"
fun mapText(text: String) = "[$text]"