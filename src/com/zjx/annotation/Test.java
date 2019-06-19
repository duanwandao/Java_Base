package com.zjx.annotation;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-06-16 15:37
 */
@TestAnnotation(id = 3, msg = "hello annotation")
public class Test {



    public static void main(String[] args) {
        boolean hasAnnotation = Test.class.isAnnotationPresent(TestAnnotation.class);
        if (hasAnnotation) {
            TestAnnotation testAnnotation = Test.class.getAnnotation(TestAnnotation.class);
            System.out.println(testAnnotation.id());
            System.out.println(testAnnotation.msg());
        }
    }
}
