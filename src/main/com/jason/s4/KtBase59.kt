package com.jason.s4

//Kotlin語言的mutator函數學習
fun main() {
    val list = mutableListOf("Jason", "JasonAll", "JasonStr", "Juan")

    /**
     * plusAssign()運算符重載
     */
    list += "Tom"
    list += "Marry"
    list -= "Jason"
    println(list)

    /**
     * removeIf() -> 刪除對應要求的元素
     * 自動遍歷整個可變集合，進行一個元素一個元素的輸出
     */
    list.removeIf {
        it.contains("Jason")
    }
    println(list)
}