package com.hspedu.string_;

/**
 * @author 韩顺平
 * @version 1.0
 */
public class StringExercise10 {
    public static void main(String[] args) {

    }
}

class Test1 {
    final char[] ch = {'j', 'a', 'v', 'a'};
    String str = "hsp";

    public static void main(String[] args) {
        Test1 ex = new Test1();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);
    }

    public void change(String str, char[] ch) {
        str = "java";
        ch[0] = 'h';
    }
}