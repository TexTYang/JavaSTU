package com.textyang.set;

import java.util.*;

public class TreeSet_ {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
//        for (int i = 10; i > 0; i--) {
//            treeSet.add(i);
//        }
        treeSet.add("tree");
        treeSet.add("a");
        treeSet.add("b");
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("abc");
        arrayList.add("YJK");
        arrayList.add("abcd");
        arrayList.add("dadada");
        arrayList.add(new Cat());
        String a = String.valueOf("abc");
        int b = Integer.parseInt(String.valueOf(10));

        System.out.println(b);

        Collections.sort(arrayList, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                String a, b;
                if (o1 instanceof String == false) {
                    a = String.valueOf(o1);
                } else {
                    a = (String) o1;
                }
                if (o2 instanceof String == false) {
                    b = String.valueOf(o2);
                } else {
                    b = (String) o2;
                }
                return a.compareTo(b);
            }

        });
        Vector x = new Vector();


        System.out.println(arrayList);

        System.out.println(arrayList.size()+" len : ");
    }
}

class Cat{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}