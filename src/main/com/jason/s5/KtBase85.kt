package com.jason.s5

//Kotlin語言的智能類型轉換學習
fun main() {
    val p: Person3 = Student3("Jason")

    /**
     * 智能類型轉換，會根據(p as Student3).methodStudent() as轉換的類型，自動轉換
     * 因此下方的p.methodStudent()可以直接調用
     */
    (p as Student3).methodStudent()
    p.methodStudent()
}

open class Person3(private val name: String) {
    private fun showName() = "父類的名稱：$name"

    open fun myPrintln() = println(showName())

    /**
     * 父類獨有的方法
     */
    fun methodPerson() = println("我是父類的方法...")
}
class Student3(private val subName: String): Person3(subName) {
    override fun myPrintln() = println("子類的名稱：$subName")

    /**
     * 子類獨有的方法
     */
    fun methodStudent() = println("我是子類的方法...")
}