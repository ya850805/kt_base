package com.jason.s2

//Kotlin語言的匿名函數學習
fun main() {
    val len = "Jason".count()
    println(len)

    val len2 = "Jason".count {
        /**
         * it等價於Jason中的每一個字符(J, a, s, o, n)
         */
        it == 'J'
    }
    println(len2)
}