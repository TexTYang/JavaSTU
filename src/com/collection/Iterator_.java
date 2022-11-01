package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("yang");
        list.add(10);
        list.add(55.5);
//        Iterator迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        增强for，底层也是迭代器
//        可以理解成简化版的迭代器

        for (Object o : list) {
            System.out.println(o);
        }

        List list1 = new ArrayList();
        list1.add(new Dog("哈士奇", 5));
        list1.add(new Dog("边牧", 3));
        list1.add(new Dog());
        Iterator iterator1 = list1.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        for (Object o : list1) {
            System.out.println(o);
        }

    }
}


class Dog {
    private String name;
    private int age;

    Dog() {
        name = "小狗";
        age = 0;
    }

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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
}