package com.jason.s6

import java.io.File

//Kotlin語言的DSL學習
fun main() {
    /**
     * 其實apply5()函數，就是DSL編程范式，定義輸入輸出規則：
     * 1. 定義整個lambda規則標準，輸入必須是Context這個類，才有資格調用apply5函數
     * 2. 定義整個lambda規則標準，輸出使用返回Context本身
     *
     * -> 然後main函數就可以根據DSL編程方式標準規則，來寫具體的實現，這就是DSL編程范式
     */
    val context = Context().apply5 {
        /**
         * this是Context()本身
         * it是String，擴展函數是傳入info
         */
        toast("it=$it, this=$this")
        toast("success!")
        toast(name)
    }
    println(context)

    /**
     * 其實applyFile()函數，就是DSL編程范式，定義輸入輸出規則：
     * 1. 定義整個lambda規則標準，輸入必須是File這個類，才有資格調用applyFile函數
     * 2. 定義整個lambda規則標準，輸出使用返回File本身
     *
     * -> 然後main函數就可以根據DSL編程方式標準規則，來寫具體的實現，這就是DSL編程范式
     */
    File("").applyFile {fileName: String, data: String? ->
        println("文件名稱：$fileName, 文件數據：$data")
    }.applyFile {a, b ->}.applyFile { a, b ->  }
}

class Context {
    val info = "Hi, I'm info"
    val name = "Jason"

    fun toast(str: String) {
        println("toast: $str")
    }
}

/**
 * DSL編程范式
 * Context擴展函數
 * Context.(String)的String就是it
 */
inline fun Context.apply5(lambda: Context.(String) -> Unit): Context {
    /**
     * 傳入的參數info調用的時候就是it
     */
    lambda(info)
    return this
}

/**
 * DSL編程范式
 */
inline fun File.applyFile(action: (String, String?) -> Unit): File {
    /**
     * 匿名函數持有xxx和QQQ字串
     */
    action("xxx", "QQQ")
    return this
}