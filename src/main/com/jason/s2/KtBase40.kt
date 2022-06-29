package com.jason.s2

//在Kotlin空合併操作符
fun main() {
    var info: String? = "info1"
    info = null

    /**
     * 使用?:空合併操作符
     * 如果前方變數為null，就會執行?:後面的代碼
     */
    println(info ?: "info is null!!!")

    /**
     * let函數 + 空合併操作符
     */
    println(info?.let { "[$it]" } ?: "info is null...")
}