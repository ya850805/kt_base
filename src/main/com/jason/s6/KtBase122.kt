package com.jason.s6

//Kotlin語言的apply函數詳解
fun main() {
    123.myApply {
        println(this > 0)
    }.myApply {
        println(this < 0)
    }

}

/**
 * 自定義apply
 *
 * private     私有化
 * inline     因為函數是高階函數，需要使用內聯對lambda進行優化處理，提高性能
 * fun <T>     函數中聲明一個泛型T
 * T.myApply     讓所有的類型都可以xxx.myApply，泛型擴展
 * T.() -> Unit     使我們匿名函數默認持有this，在lambda裡面不需要返回值，因為永遠都是返回input本身
 * return this     返回this讓我們可以鏈式調用
 */
private inline fun <T> T.myApply(lambda: T.() -> Unit): T {
    lambda()
    return this
}