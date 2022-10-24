package com.list_;

import java.util.*;

public class Present_ {
    public static void main(String[] args) {
        int i1 = 100;
        int[] a = new int[i1];
        System.out.println(Arrays.toString(a));
        NewNode newNode = new NewNode();
//        NewNode newNode1 = new NewNode();
//        Object a = newNode.print();
//        Object b = newNode1.print();
//        System.out.println(a+" "+b+" = " +(a == b));
//        HashMap hashMap = new HashMap();
        HashSet hashset = new HashSet();
        for (int i = 0; i < 12; i++) {
            hashset.add(new NewNode());
        }
        System.out.println(hashset);
//        System.out.println(15&(100^(100>>>16)));
        newNode.hashc();
//        int Arry_a[] = new int[10];
//        System.out.println(Arry_a[10]);
        System.out.println(print(10));
    }
    public static int print(int i){
        return i;
    }

}


class NewNode{
    private static final Object PRESENT = new Object();
    public Object print(){
        return PRESENT;
    }
    private int hash;
    @Override
    public int hashCode(){

        return 400;
    }
    public void hashc(){
        System.out.println(hash);
    }
}