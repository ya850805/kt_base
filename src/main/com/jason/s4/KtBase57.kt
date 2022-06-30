package com.jason.s4

//Kotlin語言的List創建與元素獲取學習
fun main() {
    /**
     * List<String>類型
     */
    val list = listOf("Jason", "Juan", "Tom", "Marry")

    /**
     * 普通取值方式：索引
     * 運算符重載，內部是使用了get()
     */
    println(list[0])
    println(list[1])
    println(list[2])
    println(list[3])
//    println(list[4])  // 報錯：java.lang.ArrayIndexOutOfBoundsException

    /**
     * 使用getOrElse(), getOrNull()，防止ArrayIndexOutOfBoundsException
     */
    println(list.getOrElse(4) {
        "index=$it, 越界"
    })
    println(list.getOrNull(4))

    /**
     * getOrNull() + 空合併操作符
     */
    println(list.getOrNull(4)?: "index超過...")
}