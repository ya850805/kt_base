package com.jason.s2

//Kotlin語言的apply內置函數
/**
 * apply()
 * 1. apply()返回類型一直是call apply()的物件本身
 * 2. apply()匿名函數持有的是this，this就是call apply()的物件本身
 */
fun main() {
    val info = "Hi Jason"
    /**
     * 普通方式
     */
    println("info字串的長度為：${info.length}")
    println("info最後一個字符是：${info[info.length - 1]}")
    println("info全部轉為小寫：${info.lowercase()}")

    println("===================")

    /**
     * 使用apply內置函數
     * apply始終返回info本身
     */
    val infoNew = info.apply {
        /**
         * 一般大部分情況下，匿名函數都會持有一個it，但是apply函數不會持有it，卻會持有this
         * this就是info本身
         */
        println("apply匿名函數裡面打印的：$this")

        /**
         * this.length可以省略成length
         */
        println("info字串的長度為：${length}")
        println("info最後一個字符是：${this[length - 1]}")
        println("info全部轉為小寫：${lowercase()}")
    }
    println("apply返回的值：$infoNew")

    println("===================")

    /**
     * 真正使用apply函數的寫法，使用鏈式調用
     */
    info.apply {
        println("info字串的長度為：$length")
    }.apply {
        println("info最後一個字符是：${this[length - 1]}")
    }.apply {
        println("info全部轉為小寫：${lowercase()}")
    }
}