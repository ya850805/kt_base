package com.jason.s5

//Kotlin語言的物件表達式學習
fun main() {
    /**
     * 匿名物件 表達式
     */
    val ktBase88 = object: KtBase88() {
        override fun add(info: String) {
            println("我是匿名物件 add:$info")
        }

        override fun del(info: String) {
            println("我是匿名物件 del:$info")
        }
    }

    ktBase88.add("Hi")
    ktBase88.del("Hi")

    /**
     * 具名實現方式
     */
    val ktBase88Impl = KtBase88Impl()
    ktBase88Impl.add("Hello")
    ktBase88Impl.del("Hello")

    /**
     * 對Java的介面，用物件表達式方式
     */
    val runnable = object: Runnable {
        override fun run() {
            println("Runnable run...")
        }
    }
    runnable.run()

    /**
     * 對Java的介面 更簡潔的寫法
     */
    val runnable1 = Runnable { println("Runnable1 run!!!") }
    runnable1.run()

    /**
     * 對自定義Kotlin的介面，用物件表達式方式
     */
    val runnableKT = object: RunnableKT {
        override fun run() {
            println("RunnableKT...")
        }
    }
    runnableKT.run()

    /**
     * 無法使用此寫法對自定義Kotlin介面，這種寫法只適合Java介面
     */
//    RunnableKT {println("RunnableKT...")}

    /**
     * 小結：
     * 1. Java介面有2種方式：(1) object: 物件表達式 (2) 簡潔版
     * 2. Kotlin介面只有1種方式：(1) object: 物件表達式
     */
}

open class KtBase88 {
    open fun add(info: String) = println("add:$info")
    open fun del(info: String) = println("del:$info")
}

/**
 * 具名實現
 */
class KtBase88Impl: KtBase88() {
    override fun add(info: String) {
        println("我是具名物件 add:$info")
    }

    override fun del(info: String) {
        println("我是具名物件 del:$info")
    }
}

interface RunnableKT {
    fun run()
}