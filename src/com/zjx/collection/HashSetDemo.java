package com.zjx.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-05-22 13:57
 */
public class HashSetDemo {

    public static void main(String[] args) {
       // hashSetTest();
        // Set 集合存和取的顺序不一致。
        Set hs = new HashSet();
        hs.add("世界军事");
        hs.add("兵器知识");
        hs.add("舰船知识");
        hs.add("汉和防务");
        // 返回此 set 中的元素的数量
        System.out.println(hs.size()); // 4

        // 如果此 set 尚未包含指定元素，则返回 true
        boolean add = hs.add("世界军事"); // false
        System.out.println(add);

        // 返回此 set 中的元素的数量
        System.out.println(hs.size());// 4
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    private static void hashSetTest(){
        //Set 集合存和取的顺序不一致。
        Set hs = new HashSet();
        hs.add("世界军事");
        hs.add("兵器知识");
        hs.add("舰船知识");
        hs.add("汉和防务");
        System.out.println(hs);
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().hashCode());
        }
        System.out.println(hs.hashCode());
    }

}
