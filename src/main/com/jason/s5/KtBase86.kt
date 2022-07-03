package com.jason.s5

//Kotlin語言的Any超類學習
fun main() {
    println(Obj1().toString())
}

/**
 * Kotlin中任何類都會隱式繼承Any
 * Any類在Kotlin設計中，只提供標準，我們看不到實現，實現在各個OS(Windows/MacOC/Linux...)中處理好了
 */
class Obj1: Any()