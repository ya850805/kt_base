package com.jason.s1

/**
 * Kotlin的引用類型
 *
 * Java語言有兩種數據類型
 *      第一種：基本類型，int, double等等
 *      第二種：引用類型，String等等
 *
 * Kotlin語言只有一種數據類型：
 *      看起來都是引用類型，實際上編譯器會在Java字節碼中修改成"基本類型"
 */
fun main() {
    /**
     * 使用Kotlin的引用類型並不會太耗費性能
     * 因為最後都會轉成Java的基本類型
     */
    val age: Int = 99
    val pi1: Float = 3.1415f
    val pi2: Double = 3.1415
    val isOk: Boolean = true
}