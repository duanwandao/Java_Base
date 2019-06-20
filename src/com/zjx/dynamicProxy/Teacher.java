package com.zjx.dynamicProxy;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-06-19 17:00
 */
public class Teacher implements People {

    @Override
    public String work() {
        System.out.println("老师教书育人...");
        return "教书";
    }

}

interface People {

    public String work();
}
