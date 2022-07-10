package com.jason.s7;

/**
 * 懶漢式的實現，Java版本
 */
public class SingletonDemo2 {
    private static SingletonDemo2 INSTANCE = null;

    private SingletonDemo2() {}

    public static SingletonDemo2 getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingletonDemo2();
        }

        return INSTANCE;
    }
}
