package com.jason.s6

import java.time.LocalDateTime

//Kotlin語言的泛型擴展函數
fun main() {
    345.showContentInfo()
    'A'.showContentInfo()
    false.showContentInfo()
    1f.showContentInfo()
    5.5.showContentInfo()
    "Jason".showContentInfo()
    testMethod().showContentInfo()
    null.showContentInfo()

    println()

    "hey".showTime()

    println()

    345.showType()
    'A'.showType()
    false.showType()
    1f.showType()
    5.5.showType()
    "Jason".showType()
    testMethod().showType()
    testMethod2().showType()
    null.showType()
}

/**
 * 如果範型為String就打印其長度，否則就返回提示信息
 */
fun <T> T.showContentInfo() = if (this is String) println("字符串長度是：${length}") else println("不是字符串，你的內容是$this")

/**
 * 顯示調用時間
 */
fun <T> T.showTime() = println("當前的時間為：${LocalDateTime.now()}")

/**
 * 顯示調用者的類型
 */
fun <T> T.showType() {
    val result =
        when (this) {
            is String -> "Is String"
            is Int -> "Is Int"
            is Char -> "Is Char"
            is Float -> "Is Float"
            is Double -> "Is Double"
            is Boolean -> "Is Boolean"
            is Unit -> "Is Unit"
            else -> "type unknown"
        }
    println(result)
}

fun testMethod() {}
fun testMethod2() = "123"