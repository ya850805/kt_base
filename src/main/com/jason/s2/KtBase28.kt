package com.jason.s2

//Kotlin語言的lambda學習
fun main() {
    val addResultMethod = {n1: Int, n2: Int ->
        "兩數相加為：${n1 + n2}"
    }
    println(addResultMethod(1, 5))

    /**
     * 返回值有Int跟String，因此類型推斷為Any
     *
     * 匿名函數入餐Int            返回Any類型
     * lambda表達式參數為Int      lambda表達式的結果為Any類型
     * ===> 匿名函數屬於lambda
     *
     * 該方法相當於
     * val weekResultMethod: (Int) -> Any = {number -> ...}
     */
    val weekResultMethod = {number: Int ->
        when(number) {
            1 -> "星期一"
            2 -> "星期二"
            3 -> "星期三"
            4 -> "星期四"
            5 -> "星期五"
            6 -> "星期六"
            7 -> "星期日"
            else -> -1
        }
    }
    println(weekResultMethod(2))
}