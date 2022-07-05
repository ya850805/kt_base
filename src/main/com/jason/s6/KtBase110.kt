package com.jason.s6

//Kotlin語言的in逆變學習
fun main() {
    /**
     * 默認情況下，範型具體處的父類是不可以賦值給範型聲明處子類的
     * ex. List<String> list = new ArrayList<CharSequence>();  ->  編譯錯誤
     *
     * 添加in後，範型的父類對象(ConsumerClass1())可以賦值給範型的子類對象(Consumer<Men>)，in T就相當於Java的? super T
     * ex. List<? super String> list = new ArrayList<CharSequence>();
     */
    val p1: Consumer<Men> = ConsumerClass1()
    val p2: Consumer<Women> = ConsumerClass2()

    /**
     * 逆變：子類範型聲明處 可以接收 父類範型具體處
     */
}

class ConsumerClass1: Consumer<Animal> {
    override fun consume1(item: Animal) {
        println("消費者 Animal")
    }
}

class ConsumerClass2: Consumer<Humanity> {
    override fun consume1(item: Humanity) {
        println("消費者 Humanity")
    }
}

class ConsumerClass3: Consumer<Men> {
    override fun consume1(item: Men) {
        println("消費者 Men")
    }
}

class ConsumerClass4: Consumer<Women> {
    override fun consume1(item: Women) {
        println("消費者 Women")
    }
}