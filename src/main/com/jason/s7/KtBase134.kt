package com.jason.s7

//註解@JvmStatic與Kotlin關係
fun main() {
    MyObject.showLocation("Jason")
}

class MyObject {
    companion object {
        @JvmField
        val target = "地點1"

        @JvmStatic
        fun showLocation(name: String) = println("${name}要去${target}玩")
    }
}