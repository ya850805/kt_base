package com.jason.s5

//Kotlin語言的枚舉類型學習
fun main() {
    println(Week.MONDAY)
    println(Week.THURSDAY.name)

    println(Week.TUESDAY is Week)
}

/**
 * Kotlin想表達枚舉也是一個class
 *
 * 枚舉的值等價於枚舉本身
 */
enum class Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}