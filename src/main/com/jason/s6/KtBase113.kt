package com.jason.s6

//Kotlin語言的定義擴展函數學習
fun main() {
    val p = KtBase113("Jason", 25, 'M')
    p.show()
    p.getInfo()

    println("Jason".addExtAction(10))
    "Juan".showStr()
}

/**
 * 假設這個代碼是開源的or是很龐大的JDK源碼，或是複雜的開源庫
 */
class KtBase113(val name: String, val age: Int, val sex: Char)

/**
 * 擴展函數
 * 擴展函數都會持有一個this，this就是這個物件本身
 */
fun KtBase113.show() {
    println("我是KtBase113的show()，name=$name, age=$age, sex=$sex")
}
fun KtBase113.getInfo() {
    println("我是KtBase113的getInfo()，name=$name, age=$age, sex=$sex")
}

/**
 * 對String做擴展
 */
fun String.addExtAction(number: Int): String {
    return this + "@".repeat(number)
}
fun String.showStr() = println(this)