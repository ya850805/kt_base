package com.jason.s4

//Kotlin語言的延遲初始化lateinit學習
fun main() {
    val ktBase78 = KtBase78()
//    ktBase78.showResponseResultInfo()   若沒有isInitialized檢查，則報錯：UninitializedPropertyAccessException: lateinit property responseResultInfo has not been initialized

    ktBase78.showResponseResultInfo()
    ktBase78.request()
    ktBase78.showResponseResultInfo()
}

class KtBase78 {
    /**
     * lateinit必須是var，可讀可改的
     * 可以先定義，之後再初始化，所以沒有賦值
     */
    lateinit var responseResultInfo: String

    /**
     * 模擬服務器請求
     *
     * 延時初始化，屬於懶加載，call此function再加載
     */
    fun request() {
        responseResultInfo = "success!"
    }

    fun showResponseResultInfo() {
        if(::responseResultInfo.isInitialized) {
            println("responseResultInfo=$responseResultInfo")
        } else {
            println("responseResultInfo haven't initialized")
        }
    }
}