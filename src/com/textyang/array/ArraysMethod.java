package com.textyang.array;

/**
 * @author Yang
 */
public class ArraysMethod {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        System.out.println("JVM总内存数：" + runtime.totalMemory() + "byte");

    }
}
