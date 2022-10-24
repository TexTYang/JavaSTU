package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        List list = new ArrayList();
//        add添加
        list.add("yang");
        list.add(10);
        list.add(55.5);
        System.out.println("List="+list);
//        remove删除
        list.remove(0);
        System.out.println("List="+list);
        list.add(55.5);
        System.out.println("List="+list);
        list.remove(55.5);
        System.out.println("List="+list);
//        contains查询是否存在
        System.out.println(list.contains(10));
    }
}
