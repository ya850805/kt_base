package com.jason.s6

import com.sun.org.apache.xpath.internal.operations.Bool

//Kotlin語言的[]操作符學習
fun main() {
    inputObj("Jason")
    inputObj("Juan")
    inputObj(null)

    val ktBase108 = KtBase108(true, "Hi", "Hello", "Yeah", null)

    /**
     * [] -> 運算符重載get(index: Int)函數
     */
    println(ktBase108[0])
    println(ktBase108[1])
    println(ktBase108[2])
    println(ktBase108[3])
}

class KtBase108<T>(private val isR: Boolean, vararg objects: T) {
    /**
     * 只讀，類型為Array<out T>
     */
    private val objectArray = objects

    fun getR1(): Array<out T>? = objectArray.takeIf { isR }
    fun getR2(): Any = objectArray.takeIf { isR }?: "objectArray is null"
    fun getR4(index: Int): T? = objectArray[index].takeIf { isR }

    /**
     * 運算符重載
     */
    operator fun get(index: Int) = objectArray[index].takeIf { isR }
}

/**
 * 泛型也可以接收null，但是接收null，要處理好
 */
fun <T> inputObj(item: T) {
    println((item as String?)?.length?: "item is null.")
}