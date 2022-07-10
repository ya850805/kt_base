package com.jason.s7;

/**
 * 懶漢式的實現(線程安全)，Java版本
 * 使用同步鎖synchronized
 */
public class SingletonDemo3 {
    private static SingletonDemo3 INSTANCE = null;

    private SingletonDemo3() {}

    public static synchronized SingletonDemo3 getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingletonDemo3();
        }

        return INSTANCE;
    }
}
