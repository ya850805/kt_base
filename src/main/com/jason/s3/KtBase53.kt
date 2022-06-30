package com.jason.s3

//Kotlin語言的with內置函數
/**
 * with()
 * 1. with()函數返回類型，是根據匿名函數最後一行的變化而變化
 * 2. with()函數的匿名函數裡持有的是this，this就是call run()函數的物件本身
 * 3. with一般常常作為初始化時使用，將要操作的變數傳進with()中，with(str)
 */
fun main() {
    val str = "Jason"
    /**
     * 具名操作
     */
    val r1 = with(str, ::getLength)
    val r2 = with(r1, ::getLengthInfo)
    val r3 = with(r2, ::getInfoMap)
    with(r3, ::show)

    /**
     * 匿名操作
     */
    with(with(with(with(str) {
        length
    }) {
        "字串長度為：$this"
    }) {
        "[$this]"
    }) {
        println(this)
    }

}

fun getLength(str: String) = str.length
fun getLengthInfo(len: Int) = "字串長度為：$len"
fun getInfoMap(info: String) = "[$info]"
fun show(content: Any) = println("$content")
