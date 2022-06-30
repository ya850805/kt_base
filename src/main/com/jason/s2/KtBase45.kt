package com.jason.s2

const val SOURCE_PASSWORD = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

//Kotlin語言的replace完成加密解碼操作
fun main() {
    println("原始密碼是：$SOURCE_PASSWORD")

    /**
     * 正則表達式要加[]
     */

    //加密，就是把字符替換成數字
    val encode = SOURCE_PASSWORD.replace(Regex("[AKMNO]")) {
//        (it.value.single() - 'A').toString()

//        it.value會是A,K,M,N,O

        when(it.value) {
            "A" -> "9"
            "K" -> "3"
            "M" -> "5"
            "N" -> "1"
            "O" -> "4"
            else -> it.value
        }
    }
    println("加密：$encode")

    //解密
    val decode = encode.replace(Regex("[93514]")) {
//        it.value會是9,3,5,1,4

        when(it.value) {
            "9" -> "A"
            "3" -> "K"
            "5" -> "M"
            "1" -> "N"
            "4" -> "O"
            else -> it.value
        }
    }
    println("解密：$decode")
}