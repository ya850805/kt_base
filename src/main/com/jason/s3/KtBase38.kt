package com.jason.s2

//Kotlin語言中的非空斷言操作符特點
fun main() {
    var name: String? = null

//    name.capitalize()   // name是可空的String，可能是null，想要使用他的function，必須給出補救措施

    /**
     * !! -> 不管name是不是null，都執行(與Java一樣)
     *
     * 如果百分百保證name是有值的，那才能使用斷言，否則有風險
     */
    println(name!!.capitalize())
}