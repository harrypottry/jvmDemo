package com.testjvm.demo;

/**
 * @Classname EdenTest
 * @Description TODO
 * @Date 2020/12/19 0019 下午 21:17
 * @Created by Administrator
 */
public class EdenTest {

    /**
     * VM : -verbose:gc -XX:+PrintGCDetails -Xmx20M -Xms20M -Xmn10M
     * @param args
     */
    public static void main(String[] args) {
        byte[] data = new byte[2 * 1024 * 1024];
    }
}
