package com.jason.s2

//Kotlin語言的函數參數學習
fun main() {
    val method : (Int, Int, Int) -> String = { number1, number2, number3 ->
        "Three params are: $number1, $number2, $number3"
    }

    println(method(50, 12, 30))
}