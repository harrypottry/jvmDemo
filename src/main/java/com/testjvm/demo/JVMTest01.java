package com.testjvm.demo;

import java.util.ArrayList;

/**
 * @Classname JVMTest01
 * @Description TODO
 * @Date 2020/12/12 0012 下午 21:46
 * @Created by Administrator
 */
public class JVMTest01 {

    byte[] bytes = new byte[1 * 1024 * 1024];

    public static void main(String[] args) {
        ArrayList<JVMTest01> list = new ArrayList<>();
        int count = 0;
        try {
            while (true) {
                list.add(new JVMTest01());
                count ++;
            }
        } catch (Throwable e) {
            System.out.println("count:" + count);
            e.printStackTrace();
        }
    }
}
