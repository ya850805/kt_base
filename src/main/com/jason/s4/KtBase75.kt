package com.jason.s4

//Kotlin語言的構造函數中默認參數學習
fun main() {
    /**
     * 構造函數都有默認參數的情況，會優先調用主構造函數
     */
    KtBase75()
}

/**
 * 構造函數使用默認參數
 */
class KtBase75(name: String = "Jason") {
    constructor(name: String = "Juan", sex: Char = 'F'): this(name) {
        println("Two parameters constructor, name=$name, sex=$sex")
    }
    constructor(name: String = "Tom", sex: Char = 'M', age: Int = 30) : this(name) {
        println("Three parameters constructor, name=$name, sex=$sex, age=$age")
    }
    constructor(name: String = "Marry", sex: Char = 'F', age: Int = 23, info: String = "Hi, this is Marry") : this(name) {
        println("Four parameters constructor, name=$name, sex=$sex, age=$age, info=$info")
    }
}