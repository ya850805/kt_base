package com.jason.s2

//Kotlin語法中對比使用if判斷null值的情況
fun main() {
    var name: String? = null

//    name.capitalize()   // name是可空的String，可能是null，想要使用他的function，必須給出補救措施

    if(name != null) {
        println(name.capitalize())
    } else {
        println("name is null")
    }
}