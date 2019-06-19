package com.zjx.reflect;

/**
 * @Description
 * @auther 断弯刀
 * @create 2019-06-16 15:57
 */
public class SonClass extends FatherClass{

    private String mSonName;
    protected Integer mSonAge;
    public String mSonBirthday;

    public void printSonMsg(){
        System.out.println("Son Msg - name : "
                + mSonName + "; age : " + mSonAge);
    }

    private void setSonName(String name){
        mSonName = name;
    }

    private void setSonAge(int age){
        mSonAge = age;
    }

    private int getSonAge(){
        return mSonAge;
    }

    private String getSonName(){
        return mSonName;
    }
}
