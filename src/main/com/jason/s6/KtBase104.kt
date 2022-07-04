package com.jason.s6

//Kotlin語言的範型函數學習
fun main() {
    /**
     * 四個物件打印
     */
    val student1 = Student0("Jason", 25, 'M')
    val student2 = Student0("Juan", 26, 'F')
    val teacher1 = Teacher0("Tom", 40, 'M')
    val teacher2 = Teacher0("Marry", 36, 'F')

    println(KtBase104(true, student1).getObj())
    println(KtBase104(true, student2).getObj())
    println(KtBase104(true, teacher1).getObj())
    println(KtBase104(true, teacher2).getObj())

    println(KtBase104(false, teacher2).getObj()?: "return null...")

    println()

    /**
     * 物件打印 + ?. + run
     * ?.  -> 如果前方為null，後面不執行
     */
    KtBase104(true, student1).getObj()?.run {
        println(this)
    } ?: println("also return null!!!")

    println()

    /**
     * 物件打印 + apply
     */
    KtBase104(false, student2).getObj().apply {
       if(this == null) println("still null...") else println("$this")
    }

    println()

    show("Jason")
    show("Juan")
    show(null)
}

/**
 * 範型T已經包含null，不需要加?
 */
fun <T> show(item: T) {
    item?.also {
        println(it)
    }?: println("show return null...")
}

class KtBase104<T>(private val isR: Boolean, private val obj: T) {
    /**
     * takeIf中如果是true，返回物件本身，false則返回null，因此函數回傳型別為T?
     */
    fun getObj(): T? = obj.takeIf { isR }
}