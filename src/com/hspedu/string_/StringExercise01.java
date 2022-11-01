package com.hspedu.string_;

/**
 * @author 韩顺平
 * @version 1.0
 */
public class StringExercise01 {
    public static void main(String[] args) {
        String a = "abcccccccccccccccccccc";
        StringBuilder b = new StringBuilder("1234567890123456789012");
        System.out.println(a.equals(b));//T

        System.out.println(b.substring(0,15));
    }
}
