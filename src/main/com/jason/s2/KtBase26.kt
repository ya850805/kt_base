package com.jason.s2

//Kotlin語言的it關鍵字特點
fun main() {
    val method : (Int, Int, Int) -> String = { number1, number2, number3 ->
        val number = 123456
        val value = "$number $number1 $number2 $number3"
        println(value)
        value
    }
    /**
     * 使用invoke相當於直接調用 -> method(1, 2, 3)
     */
    method.invoke(1, 2, 3)

    /**
     * function若為一個參數則會自帶it
     */
    val methodAction : (String) -> String = {
        "$it Jason"
    }
    println(methodAction("Hi"))

    val method0 : (Double) -> String = {
        "$it Jason"
    }
    println(method0(666.6))
}
