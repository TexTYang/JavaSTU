package com.list_;

import java.util.Arrays;

public class Vector_ {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = a;
        int[] c = a;
        a = new int[20];
        b[0] = 2;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        LinkedLis linkedLis = new LinkedLis();
        Node node = new Node("A");
        linkedLis.first = node;

        for (int i = 0; i < 5; i++) {
            node.next = new Node(Character.toString((char) (80 + i)));
            node = node.next;
        }
        linkedLis.print();
    }
}

class Node {
    public Node next;
    public Node pre;
    private String name;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class LinkedLis {
    public Node first;

    public void print() {
        if (first == null) {
            return;
        }
        Node node = first;
        while (node != null) {
            System.out.println(node.getName());
            node = node.next;
        }
    }

}