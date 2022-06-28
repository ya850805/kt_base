package com.jason.s1

//Kotlin語言的range表達式
fun main() {
    val number = 148

    if (number in 10..59) {
        println("不及格")
    } else if (number in 0..9) {
        println("不及格，並且分數過低")
    } else if (number in 60..100) {
        println("合格")
    } else if (number !in 0..100) {
        println("分數不在0~100範圍內")
    }
}