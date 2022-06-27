package com.jason.s1

//Kotlin中的只讀變量
fun main() {
    //變數永遠不會被修改，建議改成val，代表不可變的(只讀)
    val info: String = "MyInfo";
    println(info)

    /**
     * val: 只讀
     * age: 變數名
     * Int: 類型
     * 99: 值
     */
    val age: Int = 99;
//    age = 100 //不能修改
    println(age)
}