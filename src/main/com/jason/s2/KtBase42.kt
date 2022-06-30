package com.jason.s2

//Kotlin語言的先決條件函數
fun main() {
    var value: String? = null

//    checkNotNull(value) //若值為null會拋出異常 -> java.lang.IllegalStateException: Required value was null.

//    requireNotNull(value) //若值為null會拋出異常 -> java.lang.IllegalArgumentException: Required value was null.

    var value1: Boolean = false

    require(value1) //若值為false會拋出異常 -> java.lang.IllegalArgumentException: Failed requirement.
}