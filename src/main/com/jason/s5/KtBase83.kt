package com.jason.s5

//Kotlin語言的繼承與重載的open關鍵字學習
fun main() {
    val person: Person = Student("Jason")
    person.myPrintln()
}

/**
 * 所有的類默認是final修飾的，不能被繼承，和Java相反，需要添加open來移除final修飾
 */
open class Person(private val name: String) {
    private fun showName() = "父類的名稱：$name"

    /**
     * Kotlin所有的函數，默認是final修飾的，不能被重寫，和Java相反，需要添加open來移除final修飾
     */
    open fun myPrintln() = println(showName())
}
class Student(private val subName: String): Person(subName) {
    private fun showName() = "子類的名稱：$subName"

    override fun myPrintln() = println(showName())
}