package com.jason.s5

//數據類使用條件
fun main() {

}

/**
 * 數據類使用條件：
 * 1. 服務器請求回來響應的JavaBean，ex.LoginResponseBean，基本上可以使用數據類
 * 2. 數據類必須至少要有一個參數的主構造函數
 * 3. 數據類必須要有參數，var/val變量
 * 4. 數據類不能使用abstract、open、sealed、inner等等關鍵字修飾
 * 5. 需要比較(equals())、複製(copy())、解構、打印(toString())等等這些豐富的功能時，也可以使用數據類
 */
data class LoginRequest(var info: String)