package com.jason.s4

//Kotlin語言的可變Map集合學習
fun main() {
    /**
     * 類型為MutableMap<String, Int>
     */
    val map = mutableMapOf(Pair("Jason", 123), Pair("Juan", 456), Pair("Tom", 789))
    map += "AAA" to 111
    map += "BBB" to 222
    map -= "Tom"

    /**
     * put和[]等價
     */
    map.put("CCC", 888)
    map["DDD"] = 999

    /**
     * getOrPut()：可以依照key取得value，有的話會直接返回value，沒有的話會put添加並返回
     */
    val r = map.getOrPut("Jason") {777}
    println(r)
    val r1 = map.getOrPut("FFF") {777}
    println(map)
}