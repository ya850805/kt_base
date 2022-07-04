package com.jason.s5

//Kotlin語言的數據類學習
fun main() {
    /**
     * 普通類: Any()，因此toString()會打印hashCode -> com.jason.s5.ResponseResultBean1@61bbe9ba
     */
    println(ResponseResultBean1("login success", 200, "登入成功"))

    /**
     * 數據類 重寫toString() 因此打印物件信息 -> ResponseResultBean2(msg=login success, code=200, data=登入成功)
     */
    println(ResponseResultBean2("login success", 200, "登入成功"))

    println()

    /**
     * ==：值的比較，相當於Java的equals()
     * ===：引用物件的比較
     *
     * 普通類==呼叫equals()比較物件hashCode
     * 數據類==呼叫equals()比較物件屬性值
     */
    println(ResponseResultBean1("login success", 200, "登入成功") == ResponseResultBean1("login success", 200, "登入成功"))
    println(ResponseResultBean2("login success", 200, "登入成功") == ResponseResultBean2("login success", 200, "登入成功"))

    println()

    /**
     * ===都是比較hashCode
     */
    println(ResponseResultBean1("login success", 200, "登入成功") === ResponseResultBean1("login success", 200, "登入成功"))
    println(ResponseResultBean2("login success", 200, "登入成功") === ResponseResultBean2("login success", 200, "登入成功"))
}

/**
 * 普通類
 * 含有getter/setter、構造函數
 */
class ResponseResultBean1(var msg: String, var code: Int, var data: String)

/**
 * 數據類，一般用於JavaBean的形式下
 * 含有getter/setter、構造函數、解構操作、copy()、toString()、hashCode()、equals()
 */
data class ResponseResultBean2(var msg: String, var code: Int, var data: String)
