package com.testjvm.demo;

/**
 * 静态分配
 */
public class Demo3 {

    static class Super {

    }

    static class Sub1 extends Super{}

    static class Sub2 extends Super{}

    public void test(Sub1 sub1) {
        System.out.println("sub1 is called");
    }

    public void test(Sub2 sub2) {
        System.out.println("sub2 is called");
    }

    public void test(Super parent) {
        System.out.println("parent is called");
    }

    public static void main(String[] args) {
        Super c1 =  new Sub1();
        Super c2 =  new Sub2();
        Demo3 demo3 = new Demo3();
        demo3.test(c1);
        demo3.test(c2);
    }
}
