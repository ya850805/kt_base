package com.jason.s2

//Kotlin語言的可空性(Null)特點
fun main() {
    /**
     * 第一種情況：默認是不可空類型，不能隨意給null
     */
    var name: String = "Jason"
//    name = null   //Error: Null can not be a value of a non-null type String(不能是非空類型String的值)
    println(name)

    /**
     * 第二種情況：聲明時指定為可空類型
     */
    var name2: String? = "Juan"
    name2 = null
    println(name2)
}