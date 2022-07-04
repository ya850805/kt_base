package com.jason.s5

//Kotlin語言的解構聲明學習
fun main() {
    val (name, age, sex) = Student1("Jason", 25, 'M')
    println("普通類解構：name=$name, age=$age, sex=$sex")

    val (name1, age1, sex1) = Student1Data("Juan", 26, 'F')
    println("數據類解構：name1=$name1, age1=$age1, sex1=$sex1")
}

/**
 * 普通類
 */
class Student1(var name: String, var age: Int, var sex: Char) {
    /**
     * 自定義解構
     * 加上operator關鍵字
     * 必須是component開頭的函數，順序必須是1, 2, 3...
     */
    operator fun component1() = name
    operator fun component2() = age
    operator fun component3() = sex
}

/**
 * 數據類
 */
data class Student1Data(var name: String, var age: Int, var sex: Char)