package com.textyang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author 28262
 */
public class Main {
    public static final int TEMP1 = 4;
    static String temp2 = "hello";
    final int temp = 3;

    public static void main(String[] args) {

        List<String> p = new ArrayList<>();
        int[] as = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        as = Arrays.copyOf(as, as.length * 2);
        System.out.println(as.length + " " + Arrays.toString(as));
    }
}