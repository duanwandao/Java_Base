package com.zjx.comparator;

import java.util.Comparator;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-06-02 17:24
 */
public class PersonComparator implements Comparator<Person> {

    //返回1 则排序靠后
    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getAge() > p2.getAge()) {
            return 1;
        } else if (p1.getAge() < p2.getAge()) {
            return -1;
        }
        return 0;
    }
}
