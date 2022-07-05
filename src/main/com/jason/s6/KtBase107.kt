package com.jason.s6

//Kotlin語言的vararg關鍵字(動態參數)
fun main() {
    /**
     * objects為多個類型的組合因此返回類型為： KtBase107<{Comparable*>? & java.io.Serializable?}> 也可以寫父類 KtBase107<Any?>
     */
    val p = KtBase107(true, 5, 4.3, 1.4f, true, "Jason", null, 'A')

    /**
     * showObj()
     */
    println(p.showObj(0))
    println(p.showObj(1))
    println(p.showObj(2))
    println(p.showObj(3))
    println(p.showObj(4))
    println(p.showObj(5))
    println(p.showObj(6))

    println()

    /**
     * mapObj()
     * 轉換String -> Int
     */
    val r1 = p.mapObj(4) {
        it.toString().length
    }
    println("${p.showObj(4)}的長度為${r1}")

    val r2 = p.mapObj(2) {
        it.toString()
    }
    println(r2 is String)
    println(r2)

    println()

    /**
     * 因為objects參數都是String，因此返回值直接是KtBase107<String>
     *
     *
     */
    val ktBase107 = KtBase107(true, "AAA", "BBB", "CCC")
    val r3 = ktBase107.mapObj(2) {
        /**
         * it為String?，因為mapObj() lambda傳入的參數為T?
         */
        it?.length
    }
    println("參數${ktBase107.showObj(2)}的長度為：$r3")
}

/**
 * 多個參數
 */
class KtBase107<T> (private val isMap: Boolean, vararg objects: T) {
    /**
     * out：我們的T只能被讀取，不能修改
     */
    private val objectArray: Array<out T> = objects

    fun showObj(index: Int): T? = objectArray[index].takeIf { isMap }

    fun <R> mapObj(index: Int, mapAction: (T?) -> R) = mapAction(objectArray[index].takeIf { isMap })
}