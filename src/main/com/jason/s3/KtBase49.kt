package com.jason.s2

import kotlin.math.roundToInt

//Kotlin語言中Double轉Int與類型格式化
fun main() {
    /**
     * Double直接向下取整數
     */
    println(65.4236.toInt())
    println(65.5236.toInt())

    /**
     * 四捨五入
     */
    println(65.4236.roundToInt())
    println(65.5236.roundToInt())

    /**
     * 保留小數點n位數，返回一個String
     */
    val str = "%.2f".format(65.4236)
    println(str)
}