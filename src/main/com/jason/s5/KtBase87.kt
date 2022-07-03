package com.jason.s5

//Kotlin語言的物件聲明學習
fun main() {
    /**
     * singleton單例，又是類名(不能加括號)，只有一個創建，因此打印的hashCode都會一樣
     *
     * 都是調用KtBase87.INSTANCE
     */
    println(KtBase87)
    println(KtBase87)
    println(KtBase87)

    KtBase87.show()
}

/**
 * 使用object關鍵字聲明單實例的class，永遠只有一份
 */
object KtBase87 {
    /**
     * object 物件類背後做了：
     * public static final KtBase87 INSTANCE;
     *
     * static {
     *     KtBase87 var0 = new KtBase87();
     *     INSTANCE = var0;
     *
     *     //以往init區塊的會放在主構造函數中，但由於現在是object類，因此放在static區塊中
     *     String var1 = "KtBase87 init...";
     *     System.out.println(var1);
     * }
     */

    init {
        println("KtBase87 init...")
    }

    fun show() = println("show method...")
}