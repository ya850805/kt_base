package com.jason.s6

//Kotlin語言的互操作性與可空性
fun main() {
    /**
     * 下面是Java和Kotlin交互，錯誤的案例
     */
    println(KtBase129().info1.length)
//    println(KtBase129().info2.length)

    /**
     * 下面是Java和Kotlin交互，錯誤的案例
     * info1, info2類型是String!
     */
    val info1 = KtBase129().info1
    val info2 = KtBase129().info2
    println(info1.length)
//    println(info2.length)

    /**
     * 下面是Java和Kotlin交互，正確的案例1
     * 使用時需要 ?.xxx
     */
    val info1s = KtBase129().info1
    val info2s = KtBase129().info2
    println(info1s?.length)
    println(info2s?.length)

    /**
     * 下面是Java和Kotlin交互，正確的案例2(推薦)
     * 宣告時類型使用String? 來接收Java類型，因此使用時必須要用?.，否則編譯錯誤
     */
    val info1ss: String? = KtBase129().info1
    val info2ss: String? = KtBase129().info2
    println(info1ss?.length)
    println(info2ss?.length)
}

