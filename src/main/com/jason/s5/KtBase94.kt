package com.jason.s5

//Kotlin語言的運算符重載學習
fun main() {
    /**
     * Kotlin語言 plus代表+運算符重載
     */
    println(AddClass2(1, 1) + AddClass2(2, 2))
}

class AddClass1(var number1: Int, var number2: Int)

data class AddClass2(var number1: Int, var number2: Int) {
    operator fun plus(add: AddClass2): Int {
        return (number1 + add.number1) + (number2 + add.number2)
    }

    /**
     * 查看Kotlin可用的運算符重載的方式
     */
//    operator fun AddClass2.
}