package com.jason.s6

//Kotlin語言的範型類型約束學習
fun main() {
    val any = MyAnyClass("Jason1")
    val person = PersonClass("Jason1")

    val student = StudentClass("Jason1")
    val teacher = TeacherClass("Jason1")

    val dog = DogClass("Jason1")

    /**
     * 傳入MyAnyClass和DogClass會報錯，因為這兩個類不是PersonClass和其子類
     */
//    println(KtBase106(any).getObj())
    println(KtBase106(person).getObj())
    println(KtBase106(student).getObj())
    println(KtBase106(teacher).getObj())
//    println(KtBase106(dog).getObj())
}

open class MyAnyClass(name: String)
open class PersonClass(name: String): MyAnyClass(name)
class StudentClass(name: String): PersonClass(name)
class TeacherClass(name: String): PersonClass(name)

class DogClass(name: String)

/**
 * 範型約束
 * T: PersonClass，相當於Java的T extends PersonClass，只能傳入PersonClass和其子類
 */
class KtBase106<T: PersonClass>(private val input: T, private val isR: Boolean = true) {
    fun getObj() = input.takeIf { isR }
}