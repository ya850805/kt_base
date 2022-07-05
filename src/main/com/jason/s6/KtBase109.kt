package com.jason.s6

//Kotlin語言的out協變學習
fun main() {
    val p1: Producer<Animal> = ProducerClass1()

    /**
     * 默認情況下，泛型的子類對象不可以賦值給泛型的父類對象
     * ex. List<CharSequence> list = new ArrayList<String>();  ->  編譯錯誤
     *
     * 添加out後，泛型的子類對象(ProducerClass2())可以賦值給泛型的父類對象(Producer<Animal>)，out T就相當於Java的? extends T
     * ex. List<? extends CharSequence> list = new ArrayList<String>();
     */
    val p2: Producer<Animal> = ProducerClass2()
    val p3: Producer<Animal> = ProducerClass3()
    val p4: Producer<Animal> = ProducerClass4()

    /**
     * 協變：父類泛型聲明處 可以接收 子類泛型具體處
     */
}

/**
 * 生產者 out T 協變
 * <out T>代表T在整個Producer中，只能輸出
 */
interface Producer<out T> {
    /**
     * 編譯錯誤，因為T只能輸出，不能輸入
     */
//    fun produce1(item: T) {}

    /**
     * 只能被讀取
     */
    fun produce2(): T
}

/**
 * 消費者 in T 逆變
 * <in T>代表T在整個Consumer中，只能輸入
 */
interface Consumer<in T> {
    fun consume1(item: T)

    /**
     * 編譯錯誤，因為T只能輸入，不能輸出
     */
//    fun consume2(): T
}

/**
 * 生產者&消費者 T 默認情況下：是不變
 * 不寫in out就代表T可以當輸入也可以是輸出
 */
interface ProducerAndConsumer<T> {
    fun method1(item: T)

    fun method2(): T
}

open class Animal
open class Humanity: Animal()
open class Men: Humanity()
open class Women: Humanity()

class ProducerClass1: Producer<Animal> {
    override fun produce2(): Animal {
        println("生產者 Animal")
        return Animal()
    }
}

class ProducerClass2: Producer<Humanity> {
    override fun produce2(): Humanity {
        println("生產者 Humanity")
        return Humanity()
    }
}

class ProducerClass3: Producer<Men> {
    override fun produce2(): Men {
        println("生產者 Men")
        return Men()
    }
}

class ProducerClass4: Producer<Women> {
    override fun produce2(): Women {
        println("生產者 Women")
        return Women()
    }
}