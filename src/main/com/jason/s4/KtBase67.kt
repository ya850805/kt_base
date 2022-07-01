package com.jason.s4

//Kotlin語言的讀取Map的值
fun main() {
    /**
     * 方式一：使用[]
     * 運算符重載，重載get()
     * map通過key查找value，找不到會返回null
     */
    val map = mapOf("Jason" to 123, "Juan" to 456)
    println(map["Jason"])
    println(map["Juan"])
    println(map["xxx"])

    println()

    /**
     * 方式二：getOrDefault()
     */
    println(map.getOrDefault("Jason", -1))
    println(map.getOrDefault("xxx", -1))

    println()

    /**
     * 方式三：getOrElse()
     * getOrElse()返回值可以不一定是Int
     * getOrElse() 第二個參數會是個 lambda function，所以可以做更多的處理後再回傳預設值
     */
    println(map.getOrElse("Jason") { "錯誤" })
    println(map.getOrElse("xxx") { "錯誤" })

    /**
     * 方式四：getValue()
     * key找不到value會拋出NoSuchElementException
     */
    println(map.getValue("Jason"))
    println(map.getValue("xxx"))
}