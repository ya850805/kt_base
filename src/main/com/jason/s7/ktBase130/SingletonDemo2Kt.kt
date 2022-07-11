package com.jason.s7.ktBase130

/**
 * 懶漢式的實現，Kotlin版本
 */
class SingletonDemo2Kt {
    companion object {
        private var INSTANCE: SingletonDemo2Kt? = null
            get() {
                if(field == null) field = SingletonDemo2Kt()

                return field
            }

        /**
         * 斷言不為null
         */
        fun getInstance() = INSTANCE!!
    }

    fun show() {
        println("show")
    }
}

fun main() {
    SingletonDemo2Kt.getInstance().show()
}