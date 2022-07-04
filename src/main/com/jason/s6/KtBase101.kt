package com.jason.s6

//Kotlin語言介面的默認實現
fun main() {
    val usb1 = Mouse2()
    println(usb1.insertUSB())

    val usb2 = Keyboard2()
    println(usb2.insertUSB())

    usb2.usbInsertDevice = "aaa"
}

interface USB2 {
    /**
     * 介面var也是不能給該成員賦值的(有其他辦法)
     * 任何類、介面等等，val代表只讀的，是不可以在後面動態賦值(有其他辦法可以取值)
     *
     * 注意：這樣做是不對的，因為介面成員本來就是用來聲明標準的，但是可以在介面成員聲明時，完成對介面成員的實現
     */
    val usbVersionInfo: String //USB版本相關的信息
        get() = (1..100).shuffled().first().toString()
        //val不需要setter

    val usbInsertDevice: String //USB插入的設備信息
        get() = "設備接入"

    fun insertUSB(): String
}

class Mouse2: USB2 {
    /**
     * 使用介面成員的值
     */
    override fun insertUSB() = "Mouse: $usbVersionInfo, $usbInsertDevice"
}

class Keyboard2: USB2 {
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