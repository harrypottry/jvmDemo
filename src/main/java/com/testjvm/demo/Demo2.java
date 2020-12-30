package com.testjvm.demo;

import java.util.stream.Stream;

/**
 * 动态链接
 */
public class Demo2 {

    static class Super {
        public void test() {
            System.out.println("parent");
        }
    }

    static class Sub1 extends Super {

        @Override
        public void test() {
//            super.test();
            System.out.println("Sub1");
        }
    }

    static class Sub2 extends Super {

        @Override
        public void test() {
//            super.test();
            System.out.println("Sub2");
        }
    }
    public static void main(String[] args) {
//        Super c1  = new Sub1();
//        Super c2  = new Sub2();
//        c1.test();
//        c2.test();

//        List list = new ArrayList<>();
//
//        Stream.of(list)
//                .forEach(System.out::println);
        Stream.of("It's ", "a ", "wonderful ", "day ", "for ", "pie!")
                .forEach(System.out::print);
//        System.out.println();
//        Stream.of(3.14159, 2.718, 1.618)
//                .forEach(System.out::println);
    }
}
