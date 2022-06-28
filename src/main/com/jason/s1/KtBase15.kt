package com.jason.s1

//Kotlin語言的String模板
fun main() {
    val garden = "黃石公園"
    val time = 6

    val s = "今天天氣很晴朗，去${garden}玩，玩了$time 小時"
    println(s)

    /**
     * KT的if是表達式，所以可以更靈活，Java的if是語句，有局限性
     */
    val isLogin = false;
    println("server response result: ${if(isLogin) "登入成功" else "登入失敗"}")
}