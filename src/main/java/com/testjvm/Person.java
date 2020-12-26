package com.testjvm;

/**
 * @Classname Person
 * @Description TODO
 * @Date 2020/12/20 0020 下午 12:37
 * @Created by Administrator
 */
class Person{

    private String name;

    private int age;

    private static String address;

    private final static String hobby="Programming";

    public void say(){
        System.out.println("person say...");
    }

    public int calc(int op1,int op2){
        return op1+op2;
    }
}
