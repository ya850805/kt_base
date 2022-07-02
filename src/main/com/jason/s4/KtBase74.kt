package com.jason.s4

//Kotlin語言的次構造函數學習
fun main() {
    /**
     * 調用主構造函數
     */
    KtBase74("Jason")

    /**
     * 調用2個參數的次構造函數
     */
    KtBase74("Juan", 'F')

    /**
     * 調用3個參數的次構造函數
     */
    KtBase74("Tom", 'M', 30)

    /**
     * 調用4個參數的次構造函數
     */
    KtBase74("Marry", 'F', 20, "study")
}

class KtBase74(name: String) { //主構造函數
    /**
     * 次構造函數，必須調用主構造函數，否則報錯
     * 調用次構造函數，會先調用主構造函數，再執行次構造函數體
     * 為什麼次構造函數需要調用主構造函數？ Ans：主構造函數統一管理，為了更好的初始化設計
     */
    constructor(name: String, sex: Char): this(name) {
        println("Two parameters constructor, name=$name, sex=$sex")
    }
    constructor(name: String, sex: Char, age: Int) : this(name) {
        println("Three parameters constructor, name=$name, sex=$sex, age=$age")
    }
    constructor(name: String, sex: Char, age: Int, info: String) : this(name) {
        println("Four parameters constructor, name=$name, sex=$sex, age=$age, info=$info")
    }
}