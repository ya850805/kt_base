package com.jason.s2

//Kotlin語言的安全調用操作符
fun main() {
    var name: String? = "jason"
//    name = null

//    name.capitalize()   // name是可空的String，可能是null，想要使用他的function，必須給出補救措施

    val result = name?.capitalize() // name是可空的String，可能是null，如過真的是null，?後面這一段代碼不執行，就不會引發空指針異常
    println(result)
}