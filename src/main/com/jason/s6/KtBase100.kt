package com.jason.s6

//Kotlin語言的介面定義
fun main() {
    val usb1: IUSB = Mouse()
    println(usb1.insertUSB())

    val usb2: IUSB = Keyboard()
    println(usb2.insertUSB())

    usb2.usbInsertDevice = "aaa"
}

/**
 * 介面不需要加open關鍵字，介面裡面所有的成員和介面本身都是open(public)的
 * 介面不能有主構造函數
 */
interface IUSB {
    var usbVersionInfo: String //USB版本相關的信息
    var usbInsertDevice: String //USB插入的設備信息

    fun insertUSB(): String
}

/**
 * 實現類不僅要重寫介面的函數，也要重寫介面的成員
 * 介面實現類代碼區塊，全部都要增加override關鍵字來修飾
 */
class Mouse(override var usbVersionInfo: String = "USB 3.0",
            override var usbInsertDevice: String = "滑鼠"): IUSB {
    override fun insertUSB() = "Mouse: $usbVersionInfo, $usbInsertDevice"
}

class Keyboard: IUSB {
    override var usbVersionInfo: String = "USB 3.1"
        get() = field
        set(value) {
            field = value
        }

    override var usbInsertDevice: String = "鍵盤"
        get() = "你獲取了[$field]值"
        set(value) {
            println("你設置了[$value]值")
            field = value
        }

    /**
     * 會呼叫getter取值
     */
    override fun insertUSB() = "Keyboard: $usbVersionInfo, $usbInsertDevice"
}