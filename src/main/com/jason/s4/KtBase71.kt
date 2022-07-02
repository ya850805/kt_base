package com.jason.s4

//Kotlin語言的計算屬性與防範靜態條件
fun main() {
    val ktBase71 = KtBase71()
    println(ktBase71.number)
    println(ktBase71.number2)
    println(ktBase71.getShowInfo())
}

class KtBase71 {
    /**
     * 只會有getter沒有setter，因為是val只讀
     *
     * private int number = 0;
     *
     * public int getNumber() {
     *     return this.number;
     * }
     */
    val number: Int = 0

    /**
     * 從1~1000取出隨機值，返回給get()函數
     *
     * 計算屬性，下面這樣寫get()函數覆蓋了field內容本身，相當於field失效了
     *
     * 轉成Java為什麼沒有看到number2屬性定義，只有看到getNumber2()方法？
     * -> 因為屬於計算屬性的功能，根本在getNumber2()函數裡面，就沒有用到number2屬性
     */
    val number2: Int
        get() = (1..1000).shuffled().first()


//    val info: String? = null
//    val info: String? = ""
    val info: String? = "123"
    /**
     * 防範靜態條件：當調用成員變數可能為null，就必須採用防範靜態條件，這是Kotlin編程的規範化
     */
    fun getShowInfo(): String {
        return info?.let {
            if(it.isBlank()) {
                "info is empty."
            } else {
                "info=$it"
            }
        }?: "field is null."
    }
}