package com.jason.s5

//Kotlin語言的枚舉類定義函數學習
fun main() {
    /**
     * 一般的用法
     */
    println(Limbs.LEFT_HAND.show())
    println(Limbs.RIGHT_HAND.show())
    println(Limbs.LEFT_FEET.show())
    println(Limbs.RIGHT_FEET.show())

    /**
     * 更新值
     */
    Limbs.LEFT_HAND.updateData(LimbsInfo("左手2", 99))

    println(Limbs.LEFT_HAND.show())
}

/**
 * 枚舉的主構造的參數，必須和枚舉(的參數)保持一致(這邊就是都需要有LimbsInfo)
 */
enum class Limbs(private val limbsInfo: LimbsInfo) {
    LEFT_HAND(LimbsInfo("左手", 88)),
    RIGHT_HAND(LimbsInfo("右手", 88)),

    LEFT_FEET(LimbsInfo("左腳", 140)),
    RIGHT_FEET(LimbsInfo("右腳", 140));

    fun show() = "${limbsInfo.info}的長度是${limbsInfo.length}"

    fun updateData(limbsInfo: LimbsInfo) {
        this.limbsInfo.info = limbsInfo.info
        this.limbsInfo.length = limbsInfo.length

        println("更新後的數據是：${this.limbsInfo}")
    }
}

data class LimbsInfo(var info: String, var length: Int) {
    fun show() = println("${info}的長度是${length}")
}