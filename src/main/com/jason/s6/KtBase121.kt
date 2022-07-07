package com.jason.s6

/**
 * 使用as重命名擴展
 */
import com.jason.s6.randomItem as g
import com.jason.s6.randomItemPrint as p

//Kotlin語言的重命名擴展學習
fun main() {
    val list = listOf("Jason", "Juan", "John", "Marry")
    val set = setOf(1.2, 3.6, 0.5)

    /**
     * 使用擴展文件
     */
    println(list.g())
    println(set.g())
    list.p()
    set.p()
}