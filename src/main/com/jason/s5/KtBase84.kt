package com.jason.s5

import java.io.File

//Kotlin語言的類型轉換學習
fun main() {
    val p: Person2 = Student2("Juan")
    p.myPrintln()

    /**
     * 使用is檢測類型
     */
    println(p is Person2)
    println(p is Student2)
    println(p is File)

    /**
     * is + as一起使用
     */
    if(p is Student2) {
        (p as Student2).myPrintln()
    }

    if(p is Person2) {
        println((p as Person2).showName())
    }
}

open class Person2(private val name: String) {
    fun showName() = "父類的名稱：$name"

    /**
     * Kotlin所有的函數，默認是final修飾的，不能被重寫，和Java相反，需要添加open來移除final修飾
     */
    open fun myPrintln() = println(showName())
}
class Student2(private val subName: String): Person2(subName) {
    fun showName2() = "子類的名稱：$subName"

    override fun myPrintln() = println(showName2())
}