package com.zjx.reflect;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-06-17 14:57
 */
public class TestClass {

    private String MSG = "Original";

    //String 会被 JVM 优化
    private final String FINAL_VALUE = "FINAL";

    public String getFinalValue(){
        //剧透，会被优化为: return "FINAL" ,拭目以待吧
        return FINAL_VALUE;
    }

    private void privateMethod(String head , int tail){
        System.out.print(head + tail);
    }

    public String getMsg(){
        return MSG;
    }
}
