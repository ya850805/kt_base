package com.jason.s7.ktBase130;

/**
     * 懶漢式的實現(線程安全雙重校驗)，Java版本
 */
public class SingletonDemo4 {
    private volatile static SingletonDemo4 INSTANCE = null;

    private SingletonDemo4() {}

    public static SingletonDemo4 getInstance() {
        if(INSTANCE == null) {
            synchronized(SingletonDemo4.class) {
                INSTANCE = new SingletonDemo4();
            }
        }

        return INSTANCE;
    }
}
