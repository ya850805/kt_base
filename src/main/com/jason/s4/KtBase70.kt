package com.jason.s4

//Kotlin語言的定義類與field關鍵字學習
fun main() {
    /**
     * setter背後隱式代碼：new KtBase70().setName("Juan")
     */
    KtBase70().name = "Juan"

    /**
     * getter背後隱式代碼：new KtBase70().getName()
     */
    println(KtBase70().name)

    val ktBase70 = KtBase70()
    println(ktBase70.info)
    ktBase70.info = "learning kt..."
    println(ktBase70.info)
}

class KtBase70 {
    /**
     * 雖然屬性是public，但背後會封裝這個field，並創建出getter/setter(所以可以直接KtBase70().name)
     *
     * 轉成以下Java代碼：
     *
     * @NotNull  //因為我們寫的是String而不是String?
     * private String name = "Jason"
     *
     * public void setName(String name) {
     *     this.name = name;
     * }
     *
     * public String getName() {
     *      return name;
     * }
     */
    var name = "Jason"


    /**
     * 下方get()/set()為隱式代碼，不寫也有
     */
    var value = "ABC"
        get() = field
        set(value) {
            field = value
        }

    /**
     * 自行改寫，對getter/setter進行擴展
     */
    var info = "Jason is good."
        get() = field.uppercase()
        set(value) {
            field = "[$value]"
        }
}