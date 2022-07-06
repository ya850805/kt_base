package com.jason.s6

//Kotlin語言的標準函數與泛型擴展函數
fun main() {
    val r1: String = "Jason".myLet {
        "Hi"
    }

    val r2: Double = 123.myLet {
        5.5
    }

}

/**
 * private : 私有化
 * inline : 我們的函數是高階函數，所以用到內聯，做lambda的優化，提高性能
 * fun<T, R> : 在函數中，聲明兩個泛型，函數泛型，I是input，O是output
 * T.myLet : 對輸入T進行函數擴展，擴展的函數名稱是myLet，意味著所有的類型都可以使用，xxx.myLet
 * lambda: (T) -> R : T輸入->R輸出
 * lambda(this) : T進行函數擴展，在整個擴展函數裡面，this == T本身
 */
private inline fun<T, R> T.myLet(lambda: (T) -> R) = lambda(this)