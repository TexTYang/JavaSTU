package com.list_;

import java.io.Console;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet_ {
    public static void main(String[] args) {
        Set hashset = new HashSet();
//        HashSet的底层就是HashMap的底层

        hashset.add(null);
        hashset.add(null);
        Console console ;
        String a = new String("YJK");
        String b = new String("YJK");

        Node1[] table = new Node1[16];
        Node1 node1 = new Node1("john",null);

        Node1 node2 = new Node1("jack",null);
        node1.next = node2;
        Node1 node3 = new Node1("rose",null);
        node2.next = node3;
        table[2] = node1;

        System.out.println(Arrays.toString(table));

    }
}

class Node1{
    Object item;
    Node1 next;

    @Override
    public String toString() {
        return "Node1{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }

    public Node1(Object item, Node1 next) {
        this.item = item;
        this.next = next;
    }
}