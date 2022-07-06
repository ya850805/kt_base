package com.jason.s6

//Kotlin語言的infix關鍵字
fun main() {
    /**
     * map中的to也是使用infix
     * public infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)
     */
    val map = mapOf("1" to 1, "2" to 2)

    /**
     * 使用自定義中綴表達式
     */
    "壹" go 1
}

/**
 * infix：中綴表達式，可以簡化代碼
 *
 * 自定義的中綴表達式 + 擴展函數  ex. "1" go 1
 * 1. 條件一：對第一個參數C1.go 函數擴展
 * 2. 條件二：需要在括號(c2: C2)參數裡面，傳遞一個參數
 */
private infix fun <C1, C2> C1.go(c2: C2) {
    println("中綴表達式，參數一：$this，參數二：$c2")
}