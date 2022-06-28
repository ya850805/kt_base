package com.jason.s1

//Kotlin語言的when表達式
fun main() {
    val week = 9

    /**
     * Java的if語句
     * KT的if是表達式 -> 有返回值的
     * 此時的info因為有可能是String也有可能是Unit，因此他的類型為Any
     */
    val info = when(week) {
        1 -> "今天是星期1"
        2 -> "今天是星期2"
        3 -> "今天是星期3"
        4 -> "今天是星期4"
        5 -> "今天是星期5"
        6 -> "今天是星期6"
        7 -> "今天是星期7"
        else -> {
            println("else...")
        }
    }

    println(info) //void無關鍵字 無返回，用Unit類代替了java的void關鍵字
}