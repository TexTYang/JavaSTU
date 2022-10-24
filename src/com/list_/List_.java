package com.list_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("all")
public class List_ {
    public static void main(String[] args) {
//        实现List接口所独有的方法
        List list = new ArrayList();
        list.add("yang");
        list.add(10);
        list.add(55.5);
        System.out.println(list);
        list.add(1,"jia");
        System.out.println(list);
        Scanner in = new Scanner(System.in);
        char a ;
        for(int i = 0; i<10 ;i++){
            a = (char) in.nextInt();
            list.add("Fuck You"+(char)(a+i));
        }
        System.out.println(list);
        String[] as = new String[100];


    }
}
