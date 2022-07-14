package com.jason.s7.rxjava

//手寫RxJava，全部用KT的基礎來寫
fun main() {
    create {
        "AAA"
    }.map {
        "你的值是：$this"
    }.map {
        "[$this]"
    }.map {
        "@@$this@@"
    }
}

/**
 * 中轉站，保存我們的紀錄
 *
 * 主構造，接收傳遞進來的信息，此信息就是create最後一行的返回
 * value就是create操作符最後一行的返回值
 */
class RxJavaCoreClassObject<T>(var value: T)

inline fun<T, R> RxJavaCoreClassObject<T>.map(mapAction: T.() -> R): RxJavaCoreClassObject<R> = RxJavaCoreClassObject(mapAction(this.value))

/**
 * create輸入源，沒有任何參數，輸出就行(所有類型，萬能類型)
 */
inline fun <T> create(action: () -> T): RxJavaCoreClassObject<T> = RxJavaCoreClassObject<T>(action())