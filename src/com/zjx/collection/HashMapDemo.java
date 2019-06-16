package com.zjx.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-05-23 16:55
 */
public class HashMapDemo {

    public static void main(String[] args) {

    }

    private static void test(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("语文", 1);
        map.put("数学", 2);
        map.put("英语", 3);
        map.put("历史", 4);
        map.put("政治", 5);
        map.put("地理", 6);
        map.put("生物", 7);
        map.put("化学", 8);
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
