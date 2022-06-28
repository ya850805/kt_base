package com.jason.s1

//Kotlin語言的具名函數參數
fun main() {
    loginAction(age = 10, userPassword = "123", userName = "Jason", phoneNumber = "0123456789")
}

private fun loginAction(userName: String, userPassword: String, phoneNumber: String, age: Int) {
    println("userName:$userName, userPassword:$userPassword, phoneNumber:$phoneNumber, age:$age")
}