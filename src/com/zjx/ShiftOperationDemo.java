package com.zjx;

/**
 * @Description java移位运算符
 * @auther 断弯刀
 * @create 2019-05-23 9:17
 */
public class ShiftOperationDemo {

    public static void main(String[] args) {

        TestPrintInfo();
        System.out.println(10 % 8 );
        System.out.println(10 & 7);

    }

    private static void TestPrintInfo() {
        int number = 10;
        printInfo(number);
        number = number << 1;   //左移一位
        printInfo(number);
        number = number >> 1;     //右移一位
        printInfo(number);
        number = number >>> 1;     //无符号右移一位
        printInfo(number);
    }

    /**
     * 输出一个int的二进制数
     *
     * @param num
     */
    private static void printInfo(int num) {
        System.out.println("num == " + num);
        System.out.print("异或运算： ");
        System.out.println(num ^ 2);    //注意这可不是次方运算，Java没有乘幂运算符
        System.out.println("BinaryString == " + Integer.toBinaryString(num));
        System.out.println("======================================= ");
    }
}
