package com.jason.s3

//Kotlin語言的takeIf內置函數
/**
 * takeIf()
 * takeIf()的參數需要傳入一個返回Boolean的函數，如果該Boolean為true則返回調用他的物件本身，false則返回null
 * takeIf()中有一個it，就是呼叫takeIf()的物件
 */
fun main() {
    println(checkPermissionAction("root", "!@#$"))

    println(checkPermissionAction2("root2", "123"))
}

/**
 * 若takeIf的函數體(permissionAction)返回true，則takeIf返回name
 * 若takeIf的函數體(permissionAction)返回false，則takeIf返回null
 */
fun checkPermissionAction(name: String, pwd: String): String? {
    return name.takeIf { permissionAction(name, pwd) }
}

private fun permissionAction(userName: String, userPwd: String): Boolean {
    return userName == "root" && userPwd == "!@#$"
}

/**
 * 較常takeIf + 空合併操作符 一起使用
 */
fun checkPermissionAction2(name: String, pwd: String): String {
    return name.takeIf { permissionAction(name, pwd) }?: "權限不足"
}