package com.jason.s1

//Kotlin語言的Nothing類型特點
fun main() {
    show(-1)
}

/**
 * TODO方法(並不是註解)返回Nothing，Nothing會終止當前程序
 */
private fun show(number: Int) {
    when(number) {
        -1 -> TODO("沒有這種分數")
        in 0..59 -> println("不及格")
        in 60.. 70 -> println("及格")
        in 71..100 -> println("分數優秀")
    }
}