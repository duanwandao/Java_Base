package com.zjx.serializableDemo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-05-25 11:13
 */
public class User implements Serializable {

    private String name;
    private int age;
    private Date birthday;
    private transient String gender;

    private static final long serialVersionUID = -6849794470754667710L;

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }
}

