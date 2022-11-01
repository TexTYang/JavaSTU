package com.textyang;


/**
 * @author 28262
 */
public class Test {
    static int x, y;

    static {
        int x = 5;
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println(x);
        int x = 15;
        x--;
        System.out.println(x);
        myMethod();
        System.out.println(x);
        System.out.println(x + y + ++x);
    }

    public static void myMethod() {
        y = x++ + ++x;
    }
}
