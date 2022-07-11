package com.jason.s7.ktBase130;

/**
 * 餓漢式的實現，Java版本
 */
public class SingletonDemo {
    private static SingletonDemo INSTANCE = new SingletonDemo();

    private SingletonDemo() {}

    public static SingletonDemo getInstance() {
        return INSTANCE;
    }
}
