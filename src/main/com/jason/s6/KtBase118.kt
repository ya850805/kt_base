package com.jason.s6

//Kotlin語言的可空類型擴展函數
fun main() {
    /**
     * 可空String類型
     */
    val nullString: String? = null
    nullString.outputStringValue("Default value")

    /**
     * String也可以呼叫String?的擴展函數
     */
    var str: String = "123"
    str.outputStringValue("Default value")
}

/**
 * String? 可以讓String?呼叫，也可以讓String呼叫
 *
 * 如果值為null，輸出defaultValue，不為null則輸出字串本身
 */
fun String?.outputStringValue(defaultValue: String) = println(this ?: defaultValue)