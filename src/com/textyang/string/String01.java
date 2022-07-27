package com.textyang.string;

import java.util.Arrays;

/**
 * @author 28262
 */
@SuppressWarnings("all")
public class String01 {
    public static void main(String[] args){
        String name = "Yang";
        String name2 = "Yang";
        char [] a = {};
        char b[] = {};
//    char c[0] = {'a'};
        char d[] = {'a','.'};
        char[] ae = name.toCharArray();
        int [] m[] = new int[5][0];
        System.out.println(ae);
        a = Arrays.copyOf(d,100);
        System.out.println(a);
        Cat cat = new Cat();
        cat.name = "猫";
        cat.age = 2;
        Arrays.sort(d);
        Cat cat1 = cat;
        cat1.age = 1;
        System.out.println(cat.age);
        Cat cat3 = Cat.copy(cat);
        cat3.name = "cat";
        System.out.println(Arrays.toString(args));
        String x = "abc";
        String y = "abc";
        String z = new String("abc");
        System.out.println(x == z);
        try {
            int i = 1/0;
        } catch (Exception e) {
            e.printStackTrace();

            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        System.out.println(cat.name);
        System.out.println(cat == cat1);
        System.out.println(cat == cat3);
    }


}

class Cat{
    String name;
    int age;

    public static Cat copy(Cat cat){
        Cat cat1 = new Cat();
        cat1.age = cat.age;
        cat1.name = cat.name;
        return cat1;
    }
}
