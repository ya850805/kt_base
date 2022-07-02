package com.jason.s4

//Kotlin語言主構造函數裡定義屬性
fun main() {
    val ktBase73 = KtBase73("Jason", 'M', 25, "Learning Kotlin")
    ktBase73.show()
}

/**
 * 直接在主構造函數中定義變數，一步到位
 *
 * 轉譯成以下代碼：
 * class KtBase73(_name: String, _sex: Char, _age: Int, _info: String) {
 *     var name = _name
 *     val sex = _sex
 *     val age = _age
 *     var info = _info
 * }
 */
class KtBase73(var name: String, val sex: Char, val age: Int, var info: String) {
    fun show() {
        println("name=$name, sex=$sex, age=$age, info=$info")
    }
}