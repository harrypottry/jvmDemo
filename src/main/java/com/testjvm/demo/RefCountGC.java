package com.testjvm.demo;

/**
 * @Classname RefCountGC
 * @Description TODO
 * @Date 2020/12/19 0019 下午 17:26
 * @Created by Administrator
 */
public class RefCountGC {

    public Object instance = null;

    private byte[] bigSize = new byte[2 * 1034 * 1024];

    /**
     * VM : -verbose:gc -XX:+PrintGCDetails -Xmx20M -Xms20M -Xmn10M
     * @param args
     */
    public static void main(String[] args) {

        RefCountGC obj1 = new RefCountGC();
        RefCountGC obj2 = new RefCountGC();
        obj1.instance = obj2;
        obj2.instance = obj1;

        obj1 = null;
        obj2 = null;
        System.gc();
    }
}
