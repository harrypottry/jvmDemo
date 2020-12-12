package com.testjvm.utils;

import java.text.DecimalFormat;

/**
 * @Classname MemoryCalc
 * @Description TODO
 * @Date 2020/12/12 0012 下午 20:57
 * @Created by Administrator
 */
public class MemoryCalcUtil {

    public static void main(String[] args) {
        //返回 Java 虚拟机试图使用的最大内存量
        long maxMemory = Runtime.getRuntime().maxMemory();
        //返回 Java 虚拟机中的内存总量
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println("MAX_MEMORY = " + maxMemory + "(字节)、" + getSize(Long.bitCount(maxMemory)));
        System.out.println("TOTAL_MEMORY = " + totalMemory + "(字节)、" + getSize(Long.bitCount(totalMemory)));
    }

    public static String getSize(int size) {
        //定义GB的计算常量
        int GB = 1024 * 1024 * 1024;
        //定义MB的计算常量
        int MB = 1024 * 1024;
        //定义KB的计算常量
        int KB = 1024;
        //格式化小数
        DecimalFormat df = new DecimalFormat("0.0");
        String resultSize = "";
        if (size / GB >= 1) {
            //如果当前Byte的值大于等于1GB
            resultSize = df.format(size / (float) GB) + "GB   ";
        } else if (size / MB >= 1) {
            //如果当前Byte的值大于等于1MB
            resultSize = df.format(size / (float) MB) + "MB   ";
        } else if (size / KB >= 1) {
            //如果当前Byte的值大于等于1KB
            resultSize = df.format(size / (float) KB) + "KB   ";
        } else {
            resultSize = size + "B   ";
        }
        return resultSize;
    }
}
