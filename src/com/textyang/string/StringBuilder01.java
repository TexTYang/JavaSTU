package com.textyang.string;

import java.util.Scanner;

/**
 * @author 杨
 */
public class StringBuilder01 {
    public static void main(String[] args) {
        long a = (long) 45.123;
        System.out.println(a);
        double sqrt = 2.1049;
        double i = ((int) (sqrt * 100)) / 100.0;
        Scanner in = new Scanner(System.in);
//        int j = in.nextInt();
//        int k = in.nextInt();
//
//        System.out.println(i);
//        do {
//            System.out.println(Math.random()*(k-j)+j);
//            i++;
//        }while (i <10);
        System.out.printf("dadada,%.2f\n", sqrt);
        int[] d = {1, 2, 3, 412, 1};
        System.out.println(max(null));
    }

    public static int max(int... x) {
        if (x == null) {
            throw new NullWrong();
        }
        int max = x[0];
        for (int a : x
        ) {
            max = Math.max(max, a);
        }
        return max;
    }
}

class NullWrong extends RuntimeException {
    NullWrong() {
        super("错误，没有输入");
    }
}