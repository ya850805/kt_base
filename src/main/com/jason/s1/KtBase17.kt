package com.jason.s1

//Kotlin中函數參數的默認參數
fun main() {
    action01("Jason", 25)
    action01()
}

private fun action01(name: String = "Tom", age: Int = 35) {
    println("我的姓名是$name, 年齡是$age")
}