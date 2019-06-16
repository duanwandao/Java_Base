package com.zjx.comparator;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-06-02 17:49
 */
public class ComparableDemo03{
    public static void main(String args[]){
        BinaryTree bt = new BinaryTree() ;
        bt.add(8) ;
        bt.add(3) ;
        bt.add(3) ;
        bt.add(10) ;
        bt.add(9) ;
        bt.add(1) ;
        bt.add(5) ;
        bt.add(5) ;
        System.out.println("排序之后的结果：") ;
        bt.print() ;
    }
}