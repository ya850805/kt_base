package com.jason.s6

//Kotlin語言的reified關鍵字學習
fun main() {
    val result = KtBase112().randomOrDefault {
        println("不一致")
        /**
         * 備用的物件
         */
        ObjectClass1("obj1", 50, "Book")
    }
    println("最終結果：$result")
}

data class ObjectClass1(val name: String, val age: Int, val study: String)
data class ObjectClass2(val name: String, val age: Int, val study: String)
data class ObjectClass3(val name: String, val age: Int, val study: String)

class KtBase112 {
    /**
     * 產生隨機一個物件(ObjectClass1 or ObjectClass2 or ObjectClass3)，如果此物件和用戶指定的不一致，就啟用備用物件，否則直接返回物件
     */
    inline fun <reified T> randomOrDefault(defaultLambdaAction: () -> T): T {
        val list = listOf(ObjectClass1("obj1 Jason", 25, "Kotlin"),
                          ObjectClass2("obj2 Juan", 26, "JS"),
                          ObjectClass3("obj3 Tom", 30, "Python"))

        val randomObj = list.shuffled().first()

        println("隨機產生的物件為：$randomObj")

//        return if(randomObj is T) randomObj as T else defaultLambdaAction()
        return randomObj.takeIf { it is T } as T? ?: defaultLambdaAction()
    }
}