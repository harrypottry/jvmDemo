package com.testjvm.demo;


/**
 * @Classname ClassLoaderTest
 * @Description TODO
 * @Date 2020/12/12 0012 下午 15:42
 * @Created by Administrator
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        System.out.println(new ClassLoaderTest().getClass().getClassLoader().getParent().getParent());
        System.out.println(new ClassLoaderTest().getClass().getClassLoader().getParent());
        System.out.println(new ClassLoaderTest().getClass().getClassLoader());
        //双亲委派
        System.out.println(new Object().getClass().getClassLoader());
    }
}
