package com.jason.s6

/**
 * 1. 擴展文件一般都是public，如果private外界無法使用
 * 2. 使用父類(Iterable)擴展函數，讓子類(List, Set)都可以使用
 * 3. 可以將很多的擴展操作，寫到某一個地方，要用時引入，比較獨立化
 *
 *  本次擴展函數的作用是 隨機取第一個元素返回
 */
fun <T> Iterable<T>.randomItem() = this.shuffled().first()
fun <T> Iterable<T>.randomItemPrint() = println(this.shuffled().first())