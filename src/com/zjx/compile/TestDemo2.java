package com.zjx.compile;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-06-17 16:55
 */
public class TestDemo2 {

    public static void main(String[] args) {
        // 编译时类型为A，输出应该是A
        System.out.println("编译时类型为A，输出应该是A");
        A a=new A();
        System.out.println(a.name);
        A ab=new B();
        System.out.println(ab.name);
        A ac=new C();
        System.out.println(ac.name);
        // 编译时类型为B，输出应该是B
        System.out.println("编译时类型为B，输出应该是B");
        B b=new B();
        System.out.println(b.name);
        B bc=new C();
        System.out.println(bc.name);
        // 编译时类型为C，输出应该是C
        System.out.println("编译时类型为C，输出应该是C");
        C c=new C();
        System.out.println(c.name);
    }

}
class A
{
    String name="A";
}
class B extends A
{
    String name="B";
}
class C extends B
{
    String name="C";
}
