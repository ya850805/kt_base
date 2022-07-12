package com.jason.s7;

public class KtBase134 {
    public static void main(String[] args) {
        System.out.println(MyObject.target);

        /**
         * 添加@JvmStatic Java端可以直接調用函數，不用先調用Companion
         */
        MyObject.Companion.showLocation("Juan");
        MyObject.showLocation("Juan");
    }
}
