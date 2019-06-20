package com.zjx.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-06-19 17:14
 */
interface People2 {

    public People2 work(String workName);

    public String time();
}

class Student implements People2 {

    @Override
    public People2 work(String workName) {
        System.out.println("工作内容是" + workName);
        return this;
    }

    @Override
    public String time() {
        return "2018-06-12";
    }
}

public class InvocationHandler_proxy implements InvocationHandler {

    private Object obj;

    public InvocationHandler_proxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before 动态代理...");
        System.out.println(proxy.getClass().getName());
        System.out.println(this.obj.getClass().getName());
        if (method.getName().equals("work")) {
            method.invoke(this.obj, args);
            System.out.println("after 动态代理...");
            return proxy;
        } else {
            System.out.println("after 动态代理...");
            return method.invoke(this.obj, args);
        }
    }

}

class Test2 {

    public static void main(String[] args) {
        People2 people = new Student();
        InvocationHandler handler = new InvocationHandler_proxy(people);

        People2 proxy = (People2) Proxy.newProxyInstance(people.getClass().getClassLoader(), people.getClass().getInterfaces(), handler);
        People2 p = proxy.work("写代码").work("开会").work("上课");

        System.out.println("打印返回的对象");
        System.out.println(p.getClass());

        String time = proxy.time();
        System.out.println(time);
    }
}
/**
 * 输出内容:
 *
 * before 动态代理...
 * com.zjx.dynamicProxy.$Proxy0
 * com.zjx.dynamicProxy.Student
 * 工作内容是写代码
 * after 动态代理...
 * before 动态代理...
 * com.zjx.dynamicProxy.$Proxy0
 * com.zjx.dynamicProxy.Student
 * 工作内容是开会
 * after 动态代理...
 * before 动态代理...
 * com.zjx.dynamicProxy.$Proxy0
 * com.zjx.dynamicProxy.Student
 * 工作内容是上课
 * after 动态代理...
 * 打印返回的对象
 * class com.zjx.dynamicProxy.$Proxy0
 * before 动态代理...
 * com.zjx.dynamicProxy.$Proxy0
 * com.zjx.dynamicProxy.Student
 * after 动态代理...
 * 2018-06-12
 */
