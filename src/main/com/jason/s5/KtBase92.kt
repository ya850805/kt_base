package com.jason.s5

//Kotlin語言的copy函數學習
fun main() {
    val ktBase92 = KtBase92("Jason")
    println(ktBase92)

    /**
     * coreInfo屬性丟失
     * 因為使用copy()函數時，由於內部代碼只處理主構造，所以必須考慮次構造的內容
     */
    val copy = ktBase92.copy("Juan", 20)
    println(copy)
}

data class KtBase92 (var name: String, var age: Int) {
    var coreInfo: String = ""

    init {
        println("主構造函數被調用")
    }

    constructor(name: String): this(name, 25) {
        println("次構造函數被調用")
        coreInfo = "info..."
    }

    /**
     * data class默認生成的toString()只有name和age兩個屬性，沒有coreInfo，why?
     *
     * data class默認生成的函數(toString()/hashCode()/equals())等等，只管主構造函數的參數，不管次構造
     * 因此我們這邊重寫
     */
    override fun toString(): String {
        return "name:$name, age:$age, coreInfo:$coreInfo"
    }
}