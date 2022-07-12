package com.jason.s7

//註解@JvmOverloads與Kotlin
fun main() {
    showInfo("Jason")
    showInfo2("Juan")
}

fun showInfo(name: String, age: Int = 20, sex: Char = 'M') = println("name=$name, age=$age, sex=$sex")

/**
 * 使用@JvmOverloads，編譯階段會專門重載一個函數給Java使用
 */
@JvmOverloads
fun showInfo2(name: String, sex: Char = 'F') = println("name=$name, sex=$sex")

