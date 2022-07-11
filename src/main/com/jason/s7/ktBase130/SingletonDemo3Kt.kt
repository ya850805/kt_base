package com.jason.s7.ktBase130

/**
 * 懶漢式的實現(線程安全)，Kotlin版本
 * 使用@Synchronized註解
 */
class SingletonDemo3Kt {
    companion object {
        private var INSTANCE: SingletonDemo3Kt? = null
            get() {
                if(field == null) field = SingletonDemo3Kt()

                return field
            }

        @Synchronized
        fun getInstance() = INSTANCE!!
    }

    fun show() {
        println("show")
    }
}

fun main() {
    SingletonDemo3Kt.getInstance().show()
}