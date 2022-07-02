package com.jason.s4

//Kotlin語言的初始化陷阱一學習
fun main() {
    println(KtBase80().number)
}

/**
 * 該類會報錯，宣告成員變數number應該在init之前
 * 因為先執行init區塊時，會發現number還沒被定義
 */
//class KtBase80 {
//    init {
//        number = number.times(9)
//    }
//
//    var number = 9
//}

class KtBase80 {
    var number = 9

    init {
        /**
         * times()為乘法
         */
        number = number.times(9)
    }
}