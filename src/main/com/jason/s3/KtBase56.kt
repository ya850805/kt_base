package com.jason.s3

//Kotlin語言的takeUnless內置函數
/**
 * takeUnless()
 * takeUnless()與takeIf()功能相反，takeUnless()的參數需要傳入一個返回Boolean的函數，如果該Boolean為true則返回null，false則返回調用他的物件本身
 * takeUnless()中有一個it，就是呼叫takeUnless()的物件
 */
class Manager {
    private var infoValue: String? = null

    fun getInfoValue() = infoValue
    fun setInfoValue(infoValue: String) {
        this.infoValue = infoValue
    }
}

fun main() {
    val manager = Manager()

    /**
     * takeUnless()可以和it.isNullOrBlank()一起使用，可以驗證字符串有沒有初始化等功能
     */
    val r = manager.getInfoValue().takeUnless { it.isNullOrBlank() }?: "值為null"
    println(r)
}