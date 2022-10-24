
package com.textyang;

import javax.swing.*;
import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * @author 28262
 */
public class Main{
    final int temp = 3;
    public static final int TEMP1 = 4;
    static String temp2 = "hello";

    public static void main(String[] args) {

        List<String> p=new ArrayList<>();
        int[] as = {1,2,3,4,5,6,7,8,9};
        as = Arrays.copyOf(as,as.length*2);
        System.out.println(as.length+" "+Arrays.toString(as));
    }
}