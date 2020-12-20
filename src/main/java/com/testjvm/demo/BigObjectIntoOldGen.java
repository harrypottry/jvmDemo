package com.testjvm.demo;

/**
 * @Classname BigObjectIntoOldGen
 * @Description TODO
 * @Date 2020/12/19 0019 下午 21:45
 * @Created by Administrator
 */
public class BigObjectIntoOldGen {

    /**
     * VM : -verbose:gc -XX:+PrintGCDetails -Xmx20M -Xms20M -Xmn10M
     * @param args
     */
    public static void main(String[] args) {
        byte[] d1 = new byte[6 * 1024 * 1024];
    }
}
