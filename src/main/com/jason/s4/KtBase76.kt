package com.jason.s4

//Kotlin語言的初始化塊學習
fun main() {
    /**
     * 主構造函數調用
     */
    KtBase76("Jason", 25, 'M')

    println()

    /**
     * 次構造函數調用
     */
    KtBase76("Tom")
    KtBase76("Larry", 50, 'M')
//    KtBase76("")   //報錯：IllegalArgumentException
//    KtBase76("Marry", -1, 'M')   //報錯：IllegalArgumentException
//    KtBase76("John", 10, 'X')   //報錯：IllegalArgumentException
}

/**
 * 臨時類型參數
 */
class KtBase76(userName: String, userAge: Int, userSex: Char) { //主構造函數
    /**
     * 初始化塊，init代碼塊
     * 不是Java的static，相當於Java的構造函數代碼塊
     * 執行主構造函數的時候，就會執行init代碼塊
     * init區塊可以調用臨時類型參數
     */
    init {
        println("主構造函數被調用了， $userName, $userAge, $userSex")

        /**
         * 如果第一個參數是false，就會調用第二個參數的lambda，會拋出IllegalArgumentException
         */
        require(userName.isNotBlank()) {
            "userName is blank!!!"
        }

        require(userAge > 0) {
            "userAge is illegal!!!"
        }

        require(userSex == 'M' || userSex == 'F') {
            "userSex is illegal!!!"
        }
    }

    constructor(userName: String): this(userName, 30, 'M') {
        println("次構造函數被調用了")
    }
}