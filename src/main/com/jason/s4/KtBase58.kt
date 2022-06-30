package com.jason.s4

//Kotlin語言的可變List集合學習
fun main() {
    /**
     * 類型為MutableList<String>
     */
    val list = mutableListOf("Jason", "Juan")
    list.add("Tom")
    list.remove("Juan")
    println(list)

    /**
     * toMutableList()：不可變集合to可變集合
     */
    val list1 = listOf(123, 456, 789)
    val list2: MutableList<Int> = list1.toMutableList()
    list2.add(111)
    list2.remove(123)
    println(list2)

    /**
     * toList()：可變集合to不可變集合
     */
    val list3 = mutableListOf('A', 'B', 'C')
    list3.add('D')
    list3.remove('A')
    val list4 = list3.toList()
    println(list4)
}