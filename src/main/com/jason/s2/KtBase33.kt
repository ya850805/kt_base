package com.jason.s2

//Kotlin語言的函數類型作為返回類型
fun main() {
    /**
     * 返回值anonymousFun是一個函數，可再調用
     */
    val anonymousFun = show("學習KT")

    println(anonymousFun("Jason", 25))
    println(anonymousFun.invoke("Tom", 21))
}

/**
 * 此方法再返回一個匿名函數
 */
private fun show(info: String): (String, Int) -> String {
    println("info: $info")

    /**
     * 返回一個匿名函數
     */
    return {name: String, age: Int ->
        "name: $name, age: $age"
    }
}