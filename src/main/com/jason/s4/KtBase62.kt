package com.jason.s4

//Kotlin語言的Set創建與元素獲取
fun main() {
    /**
     * Set集合不會出現重複元素
     */
    val set = setOf("Jason", "Juan", "Tom", "Tom")
    println(set)

    /**
     * 沒有提供[]的功能去取Set元素
     */
//    set[0]
    println(set.elementAt(0))
    println(set.elementAt(1))
    println(set.elementAt(2))
    //    println(set.elementAt(3))   //報錯，越界 -> IndexOutOfBoundsException

    println()

    println(set.elementAtOrElse(0) { "IndexOutOfBoundsException!!!!!" })
    println(set.elementAtOrElse(3) { "IndexOutOfBoundsException!!!!!" })

    println()

    /**
     * 與空合併操作符一起使用
     */
    println(set.elementAtOrNull(0))
    println(set.elementAtOrNull(3)?: "IndexOutOfBoundsException...")
}