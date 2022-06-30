package com.jason.s2

//在Kotlin中使用帶let的安全調用
fun main() {
    var name: String? = null
//    name = "Jason"
    name = ""

    val result = name?.let {
        /**
         * it為name本身
         * 如果能夠執行到這裡面的，it一定不為null
         */
        if(it.isBlank()) { //如果name是空字串""，給定一個預設值
            "default value"
        } else {
            it
        }
    }

    println(result)
}