package com.jason.s3

//Kotlin語言的also內置函數
/**
 * also()
 * 1. also()函數返回類型一直是call also()的物件本身
 * 2. also()匿名函數持有的是it，it就是call also()的物件本身
 * 3. also()通常為鏈式操作
 */
fun main() {
    val str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    str.also {
        println("str的原始數據是：$it")
    }.also {
        println("str轉換大寫：${it.lowercase()}")
    }.also {
        println("結束了")
    }
}