package com.testjvm.demo;

/**
 * @Classname SpaceGuarantee
 * @Description TODO
 * @Date 2020/12/19 0019 下午 22:00
 * @Created by Administrator
 */
public class SpaceGuarantee {

    /**
     * VM : -verbose:gc -XX:+PrintGCDetails -Xmx20M -Xms20M -Xmn10M
     * @param args
     */
    public static void main(String[] args) {
        byte[] d1 = new byte[2 * 1024 * 1024];
        byte[] d2 = new byte[2 * 1024 * 1024];
        byte[] d3 = new byte[2 * 1024 * 1024];
        byte[] d4 = new byte[4 * 1024 * 1024];

        System.gc();
    }
}
