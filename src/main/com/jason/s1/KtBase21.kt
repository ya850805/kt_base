package com.jason.s1

//Kotlin語言的反引號中函數名特點
fun main() {
    /**
     * 中文方法名
     */
    `測試中文名稱`("Jason", "123")

    /**
     * in和is在kotlin裡面是關鍵字，在Java是普通字，因此在Kotlin中可以用``匡起來
     */
    KtBase21.`in`()
    KtBase21.`is`()
}

private fun `測試中文名稱`(name: String, pwd: String) {
    println("用戶名是$name, 密碼是$pwd")
}


