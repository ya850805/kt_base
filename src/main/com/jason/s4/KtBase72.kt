package com.jason.s4

//Kotlin語言主構造函數學習
fun main() {
    val ktBase72 = KtBase72(_name = "Jason", _sex = 'M', _age = 25, _info = "learning Kotlin")
    println(ktBase72.name)
//    ktBase72.name = "Juan"   //報錯，因為setter是private的

    ktBase72.show()
}

/**
 * 主構造函數：規範來說，都是增加_xxx的方式，這些都是臨時的輸入類型，不能直接使用，需要接收成變數才能使用
 */
class KtBase72(_name: String, _sex: Char, _age: Int, _info: String) { //主構造函數

    /**
     * getter不允許私有化private
     */
    var name = _name
        get() = field
        private set(value) {
            field = value
        }

    /**
     * 不能有setter，因為是val只讀變數
     */
    val sex = _sex
        get() = field
//        set(value) {
//            field = value
//        }

    val age = _age
        get() = if(field < 0) -1 else field

    val info = _info

    fun show() {
        println("name=$name, sex=$sex, age=$age, info=$info")
    }
}