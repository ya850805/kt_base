package com.jason.s1

//Kotlin語言的函數頭學習
fun main() {
    method01(25, "Jason")
}

/**
 * 函數默認都是public
 * 其實Kotlin的函數更規範，先有輸入再有輸出
 *
 * private: 存取修飾
 * fun: 函數聲明關鍵字
 * method01: 函數名
 * age: Int, name: String: 函數參數
 * Int: 返回類型
 */
private fun method01(age: Int, name: String): Int {
    println("name: ${name}, age: $age")
    return 200;
}

/*
上方的函數會變成以下的Java代碼
private static final int method01(int age, String name) {
  String var2 = "name: " + name + ", age: " + age;
  boolean var3 = false;
  System.out.println(var2);
  return 200;
}
 */