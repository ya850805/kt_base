package com.jason.s6

import java.time.LocalDateTime

/**
 * 擴展屬性
 *
 * 背後代碼：
 * public final class KtBase117Kt {
        @NotNull
        public static final String getMyInfo(@NotNull String $this$myInfo) {
            Intrinsics.checkNotNullParameter($this$myInfo, "$this$myInfo");
            return "My info...";
        }
 * }
 */
val String.myInfo: String
    get() = "My info..."

val String.stringAllInfoValueVal
    get() = "當前時間：${LocalDateTime.now()}，當前的值：${this}，字串長度為：${length}"

//Kotlin語言的擴展屬性
fun main() {
    val str = "ABC"
    println(str.myInfo)

    println()

    /**
     * 鏈式調用
     */
    str.showPrintln().showPrintln().showPrintln().myInfo.showPrintln().showPrintln().showPrintln()

    println()

    "666".stringAllInfoValueVal.showPrintln().showPrintln().myInfo.stringAllInfoValueVal.showPrintln().showPrintln()
}

/**
 * this代表String本身
 */
fun String.showPrintln(): String {
    println("打印內容：$this")
    return this
}
