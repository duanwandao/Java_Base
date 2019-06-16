package com.zjx.comparator;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-06-02 17:47
 */
public class ComparableDemo02 {

    public static void main(String args[]){
        Comparable com = null ;			// 声明一个Comparable接口对象
        com = 30 ;						// 通过Integer为Comparable实例化
        System.out.println("内容为：" + com.toString()) ;	// 调用的是toString()方法
    }
}
