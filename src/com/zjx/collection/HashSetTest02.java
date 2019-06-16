package com.zjx.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-06-01 17:51
 */
public class HashSetTest02 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new Person("jack", 20));
        hs.add(new Person("rose", 20));
        hs.add(new Person("hmm", 20));
        hs.add(new Person("lilei", 20));
        hs.add(new Person("jack", 20));

        Iterator it = hs.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next);
        }
    }
}


class Person {
    private String name;
    private int age;

    Person() {

    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode:" + this.name);
        return this.name.hashCode() + age * 37;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println(this + "---equals---" + obj);
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {

        return "Person@name:" + this.name + " age:" + this.age;
    }

}
