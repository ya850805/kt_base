package com.jason.s2

//Kotlin語言匿名函數的類型推斷
fun main() {
    /**
     * 匿名函數，類型推斷為String
     * 使用:   必須指定參數類型和返回類型
     * 使用=   類型推斷返回類型
     *
     * 下方寫法相當於
     * val method1 : (Double, Float, Int) -> String = {v1, v2, v3 -> ...}
     */
    val method1 = {v1: Double, v2: Float, v3: Int ->
        "v1=$v1, v2=$v2, v3=$v3"
    }
    println(method1(5.5, 3.1f, 8))

    /**
     * 相當於
     * val method2 : () -> Float = {...}
     */
    val method2 = {
        2.5f
    }
    println(method2())

    /**
     * 相當於
     * val method3 : (Int) -> Int = {number -> ...}
     */
    val method3 = {number: Int ->
        number
    }
    println(method3(9))
}