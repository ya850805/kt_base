package com.jason.s6

//Kotlin語言的定義泛型類
fun main() {
    val student1 = Student0("Jason", 25, 'M')
    val student2 = Student0("Juan", 26, 'F')

    val teacher1 = Teacher0("Tom", 40, 'M')
    val teacher2 = Teacher0("Marry", 36, 'F')

    KtBase103(student1).show()
    KtBase103(student2).show()
    KtBase103(teacher1).show()
    KtBase103(teacher2).show()

    KtBase103(String("Hi".toByteArray())).show()
}

/**
 * 物件輸出器
 */
class KtBase103<T>(private val obj: T) {
    fun show() = println("輸出:$obj")
}

data class Student0(val name: String, val age: Int, val sex: Char)
data class Teacher0(val name: String, val age: Int, val sex: Char)