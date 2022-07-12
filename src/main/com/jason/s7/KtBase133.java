package com.jason.s7;

public class KtBase133 {
    public static void main(String[] args) {
        /**
         * Java端調用Kotlin方法，但Java無法使用Kotlin方法的默認參數值
         */
//        KtBase133Kt.showInfo("Jason");

        /**
         * 相當於Java使用Kotlin的默認參數
         */
        KtBase133Kt.showInfo2("Juan");
    }
}
