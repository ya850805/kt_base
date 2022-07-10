package com.jason.s7

/**
 * 懶漢式的實現(線程安全雙重校驗)，Kotlin版本
 */
class SingletonDemo4Kt private constructor() {
    companion object {
        val instance: SingletonDemo4Kt by lazy ( mode = LazyThreadSafetyMode.SYNCHRONIZED ) {SingletonDemo4Kt()}
    }

    fun show() {
        println("show")
    }
}

fun main() {
    SingletonDemo4Kt.instance.show()
}