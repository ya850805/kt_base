package com.jason.s6

//Kotlin語言中使用in和out
fun main() {
    /**
     * 逆變 in T
     */
    SetClass<String>().set1("item!!!")

    /**
     * 協變 out T
     */
    println(GetClass<String>("Jason").get1())
}

/**
 * 整個SetClass中，泛型T相關的只能當作輸入，不能當作輸出 -> 逆變
 */
class SetClass<in T>() {
    fun set1(item: T) = println("set1 設置的item是$item")

    /**
     * 編譯不通過，T不能給外界讀取
     */
//    fun get1(): T? = null
}

/**
 * 整個GetClass中，泛型T相關的只能當作輸出，不能當作輸入 -> 協變
 */
class GetClass<out T>(private val item: T) {

    /**
     * 編譯不通過，T只能讀取，不能給外界輸入(修改)
     */
//    fun set1(item: T) = println("set1 設置的item是$item")

    fun get1(): T = item
}