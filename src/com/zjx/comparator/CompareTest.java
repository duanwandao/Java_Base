package com.zjx.comparator;

import java.util.Arrays;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-06-02 17:26
 */
public class CompareTest {

    public static void main(String[] args) {
        Person[] persons = {
                new Person("P1", 60),
                new Person("P2", 20),
                new Person("P3", 40)
        };
        System.out.println(Arrays.toString(persons));

        Arrays.sort(persons,new PersonComparator());

        System.out.println(Arrays.toString(persons));
    }
}
