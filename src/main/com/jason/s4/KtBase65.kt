package com.jason.s4

import java.io.File

//Kotlin中的陣列類型
fun main() {
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    println(intArray)
    println(intArray[0])
    println(intArray[1])
    println(intArray[2])
    println(intArray[3])
    println(intArray[4])
//    println(intArray[5]) //報錯，越界 -> ArrayIndexOutOfBoundsException

    println()

    /**
     * 使用elementAtOrElse() elementAtOrNull()避免ArrayIndexOutOfBoundsException
     * 如果是IntArray，那elementAtOrElse()就只能回傳Int
     */
    println(intArray.elementAtOrElse(5) { -1 })
    println(intArray.elementAtOrNull(5))

    println()

    /**
     * 搭配空合併操作符
     */
    println(intArray.elementAtOrNull(666) ?: "ArrayIndexOutOfBoundsException...")

    println()

    /**
     * 集合轉陣列
     */
    val charArray = listOf('A', 'B', 'C').toCharArray()
    println(charArray)

    /**
     * 物件類型的陣列
     */
    val obj: Array<File> = arrayOf(File("AAA"), File("BBB"), File("CCC"))
    println(obj)
}