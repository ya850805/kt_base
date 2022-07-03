package com.jason.s5

//Kotlin語言的伴生物件學習
fun main() {
    /**
     * 背後代碼：System.out.println(KtBase89.Companion.info)
     */
    println(KtBase89.info)

    KtBase89.showInfo()

    /**
     * 伴生物件只會初始化一次
     */
    KtBase89()
    KtBase89()
    KtBase89()
    KtBase89()


}

class KtBase89 {
    /**
     * 伴生物件
     *
     * 伴生物件的由來：在Kotlin中沒有Java這種static靜態，伴生很大程度上跟Java的static靜態差不多
     * 無論原物件new多少次，伴生物件只有加載一次
     * 背後實現會new一個Companion物件，Companion類是static的
     * 寫在伴生物件裡面的屬性都是靜態的
     */
    companion object {
        var info = "Jason"

        fun showInfo() = println("info=$info")
    }
}