package com.textyang.debug;

/**
 * @author 28262
 */
public class Debug01 {
    public static void main(String[] args){
        int sum = 0;
        int j = 5;
        for(int i = 0; i < j; i++){
            try {
                sum += i;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
            System.out.println(sum);
        }

        System.out.println("end");
    }
}
