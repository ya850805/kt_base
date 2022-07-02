package com.jason.s4

//Kotlin語言的構造初始化順序學習
fun main() {
    /**
     * 調用次構造函數
     */
    KtBase77("Jason", 'M', 25)
}

/**
 * 1. 第一步：生成 val sex: Char
 */
class KtBase77(_name: String, val sex: Char) { //主構造函數
    /**
     * 2. 第二步：生成val mName，這步與init並行，但由於寫在init前面因此先執行
     */
    val mName = _name

    init {
        /**
         * 3. 第三步：生成val nameValue
         */
        val nameValue = _name
        println("init代碼塊打印：$nameValue")
    }

    constructor(name: String, sex: Char, age: Int): this(name, sex) {
        /**
         * 5. 第五步：執行次構造函數體
         */
        println("次構造函數，name:$name, sex:$sex, age:$age")
    }

    /**
     * 4. 第四步：生成val greeting，這步與init並行，但由於寫在init後面因此後執行
     */
    val greeting = "Hi"
}