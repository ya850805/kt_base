package com.jason.s5


//Kotlin語言的嵌套類學習
fun main() {
    /**
     * 內部類
     */
    Body("isOK").Heart().run()
    Body("isOK").Hand().LeftHand().run()

    /**
     * 嵌套類
     */
    Outer.Nested().output()
}

class Body(_bodyInfo: String) {
    val bodyInfo = _bodyInfo

    /**
     * 外部類可以訪問內部類
     */
    fun show() {
        Heart().run()
    }

    /**
     * 默認情況下，內部的類不能訪問外部的類，需要增加inner修飾符才可以訪問外部類
     */
    inner class Heart {
        fun run() = println("心臟訪問外部身體類信息：$bodyInfo")
    }

    inner class Kidnev {
        fun work() = println("腎臟訪問外部身體類信息：$bodyInfo")
    }

    /**
     * 兩層內部類的話，都需要加inner修飾符
     */
    inner class Hand {
        inner class LeftHand {
            fun run() = println("左手訪問外部身體類信息：$bodyInfo")
        }
        inner class RightHand {
            fun run() = println("右手訪問外部身體類信息：$bodyInfo")
        }
    }
}

/**
 * 嵌套類
 *
 * 默認情況下就是嵌套關係：外部類可以訪問內部嵌套類，內部嵌套類不能訪問外部類的成員
 */
class Outer {
    val info: String = "OK"

    fun show() = Nested().output()

    class Nested {
//        fun output() = println(info)
        fun output() = println("嵌套類")
    }
}