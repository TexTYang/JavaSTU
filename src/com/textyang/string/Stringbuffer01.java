package com.textyang.string;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Yang
 */
public class Stringbuffer01 {
    public static void main(String[] args) {
        StringBuffer stringbuffer = new StringBuffer();
        System.out.println(stringbuffer.length());
        String nu = null;
        stringbuffer.append(nu);
        System.out.println(nu);
        System.out.println(":"+stringbuffer.length());
        String string = "hello";
        System.out.println(System.identityHashCode(string));
        for(int o=0;o<1;o++){
            string="aa";
        }
        string="hello";
        System.out.println(System.identityHashCode(string));
        StringBuffer stringbuffer1 = new StringBuffer(string);
        stringbuffer = stringbuffer.append(string);
        System.out.println(stringbuffer);
        stringbuffer.append("a");
        System.out.println(stringbuffer);
        stringbuffer.delete(1,2);
        System.out.println(stringbuffer);
        stringbuffer.replace(1,2,"adada");
        stringbuffer.append(nu);
        System.out.println(stringbuffer);

        System.out.println(stringbuffer.subSequence(1,5));


        System.out.println(stringbuffer.length());
        Scanner in = new Scanner(System.in);
        StringBuffer shop = new StringBuffer();
        shop.append(in.nextLine());
        StringBuffer sh = new StringBuffer();
        try {
            sh.append(in.nextDouble());
        } catch (InputMismatchException e) {
            System.out.println("您输入的数据类型有误");
        }
        System.out.println(sh);
        int i = sh.lastIndexOf(".");
        for(;;){
            if(i <= 3){
                break;
            }
            else{
                i = i - 3;
                sh.insert(i,",");
            }
        }
        shop.append("  ").append(sh);
        System.out.println(shop);
    }
}
