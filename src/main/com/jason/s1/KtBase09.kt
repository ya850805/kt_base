package com.jason.s1

//Kotlin語言的類型判斷
fun main() {
    /**
     * val info: String = "This is my info"
     * 會提示String -> Explicitly given type is redundant here
     * 給定的類型String在這裡是多餘的(可以從後方的值推斷是一個String)
     */
    val info: String = "This is my info"
    println(info)

    val age = 98
    println(age)

    val xxx = true
}