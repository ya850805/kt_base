package com.jason.s6

//Kotlin語言的泛型變換實戰
fun main() {
    /**
     * Int轉String
     */
    val input = 85
    val value1 = KtBase105(true, input).map {
        it.toString()  //lambda最後一行為返回值
    }
    println(value1 is String)

    val value2 = KtBase105(false, input).map {
        it.toString()
    }
    println(value2 == null)

    /*******************************************************/
    println()
    /*******************************************************/

    val personInput = Person("Jason", 25)
    val value3 = KtBase105(true, personInput).map {
        Student(it.name, it.age)
    }
    println(value3 is Student)
    println(value3)

    /*******************************************************/
    println()
    /*******************************************************/

    /**
     * 使用自定義函數
     */
    val inputValue = 123
    val value4 = map(inputValue = inputValue) {
        it.toString()
    }
    println(value4 is String)
}

class KtBase105<T>(val isMap: Boolean = false, val input: T) {
    /**
     * T是要變換的類型，R是變換後的類型
     *
     * map()函數返回類型是R?，可能為null因為使用了takeIf()
     */
    inline fun <R> map(mapAction: (T) -> R) = mapAction(input).takeIf { isMap }
}

data class Person(val name: String, val age: Int)
data class Student(val name: String, val age: Int)

inline fun <T, R> map(isMap: Boolean = true, inputValue: T, mapAction: (T) -> R) = if(isMap) mapAction(inputValue) else null
