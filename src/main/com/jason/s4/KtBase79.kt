package com.jason.s4

//Kotlin語言的惰性初始化by lazy學習
fun main() {
    /**
     * 不使用惰性初始化
     */
//    val ktBase79 = KtBase79()
//    Thread.sleep(5000)
//    println("即將開始使用")
//    println("最終顯示：${ktBase79.databaseData1}")

    /**
     * 使用惰性初始化
     */
    val ktBase79 = KtBase79()
    Thread.sleep(5000)
    println("即將開始使用")
    println("最終顯示：${ktBase79.databaseData2}")
}

/**
 * lateinit是在使用的時候，"手動"加載的懶加載方式，然後再使用
 * 惰性初始化by lazy，是在使用的時候，自動加載的懶加載方式，然後再使用
 */
class KtBase79() {
    /**
     * 不使用惰性初始化by lazy普通方式
     */
//    val databaseData1 = readSQLServerDatabaseAction()

    /**
     * 使用惰性初始化by lazy普通方式，當我們用他時才會加載
     */
    val databaseData2 by lazy { readSQLServerDatabaseAction() }

    private fun readSQLServerDatabaseAction(): String {
        println("開始讀取數據庫數據中...")
        println("加載讀取數據庫數據中...")
        println("加載讀取數據庫數據中...")
        println("加載讀取數據庫數據中...")
        println("結束讀取數據庫數據中...")
        return "database data load success!"
    }
}