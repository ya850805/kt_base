package com.jason.s2

//Kotlin語言的匿名函數&具名函數
fun main() {
    /**
     * 匿名函數
     */
    showPersonInfo("Jason", 25, 'M', "learning Kotlin") {
        println(it)
    }

    /**
     * 具名函數
     */
    showPersonInfo("Juan", 25, 'F', "learning JS", ::showResult)
}

fun showResult(result: String) {
    println(result)
}

inline fun showPersonInfo(name: String, age: Int, sex: Char, study: String, showResult: (String) -> Unit) {
    val str = "name: $name, age: $age, sex: $sex, study: $study"
    showResult(str)
}