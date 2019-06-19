package com.zjx.compile;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-06-17 16:53
 */
public class TestDemo1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person p=new Women();
        System.out.println("p.name:"+p.name);  //输出   p.name:person
        //   想想为什么呢？只被一个类继承的时候可能会迷惑，如果要是被100个类继承了呢？如果输出子类信息那就晕了
        p.show();
        //   p.newMethod()  会报错
        //  规则  ： 规则–对象调用编译时类型的属性和运行时类型的方法
    }

}
class Person{
    public String name;
    public Person()
    {
        name="person";
    }
    public void show()
    {
        System.out.println("class person's show()");
    }
}

class Women extends Person
{
    public String name;
    public Women()
    {
        name="women";
    }
    public void show()
    {
        System.out.println("class women's show()");
    }

    public void newMethod()
    {
        System.out.println("我是独立出来的newMethod()");
    }
}
