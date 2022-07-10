package com.jason.s6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KtBase128 {
    public static void main(String[] args) {
        /**
         * 1. 定義name集合
         */
        List<String> names = new ArrayList<>();
        names.add("Jason");
        names.add("Juan");
        names.add("Tom");
        names.add("Marry");

        /**
         * 2. 定義age集合
         */
        List<Integer> ages = new ArrayList<>();
        ages.add(25);
        ages.add(26);
        ages.add(30);
        ages.add(35);

        /**
         * 3. 合併以上兩個集合
         */
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < names.size(); i++) {
            map.put(names.get(i), ages.get(i));
        }

        /**
         * 4. 添加詳細內容，方便輸出
         */
        List<String> showList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String result = String.format("your name: %s, your age: %d", entry.getKey(), entry.getValue());
            showList.add(result);
        }

        /**
         * 5. 輸出
         */
        for (String s : showList) {
            System.out.println(s);
        }
    }
}
