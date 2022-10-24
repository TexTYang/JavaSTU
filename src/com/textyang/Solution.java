package com.textyang;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;


/**
 * @author 杨
 */
public class Solution {

    public static int divide(int a, int b)  {
        if (a == Integer.MIN_VALUE && b == -1) {
            return Integer.MAX_VALUE;
        }
        int x = -Math.abs(a);
        int y = -Math.abs(b);
        int e = 1,f,g=0;

        while(x<=y){
            for(f = y;;){
                int k = f<<1;
                if(k >=0){
                    break;
                }
                if(f>=x){
                    f <<= 1;
                }
                if(x>f){
                    f >>= 1;
                    break;
                }
                else{
                    e <<= 1;
                }
            }
            g += e;
            e = 1;
            x -= f;
            if( x > y) {
                if (((a ^ b) >>> 31) == 1) {
                    g = -g;
                }
                return g;
            }

        }
        return  0;
    }

@SuppressWarnings("all")
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("1024");
        sb.append("Mr ")
                .append("Bob")
                .append("!")
                .insert(0, "Hello, ");
        System.out.println(sb);
        Adder adder = new Adder();
        adder.add(3)
                .add(5)
                .inc()
                .add(10);
        int[][] arr = new int['a'][];
        Formatter format = new Formatter();
        int i = 10;
        System.out.println(format.format("%o",i));
        System.out.println(i);
        System.out.println(sb.toString());
        System.out.println(adder.value());
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s);
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
        List<Adder> arrayList = new ArrayList<>();
        System.out.println(divide(Integer.MAX_VALUE,1));
        System.out.println(Math.abs(Integer.MIN_VALUE-1));


    }
    @SuppressWarnings("all")
    static String buildInsertSql(String table, String[] fields) {
        StringBuilder a = new StringBuilder("INSERT INTO employee (");
        String b = String.join(", ",fields);
        a.append(b).append(") VALUES (?, ?, ?)");
        System.out.println(a.toString());
        return a.toString();
    }

}



class Adder {
    private int sum = 0;

    public void method(){
        IA tiger = new IA(){
            @Override
            public void cry() {

            }
        };
    }
    public Adder add(int n) {
        sum += n;
        return this;
    }

    public Adder inc() {
        sum ++;
        return this;
    }

    public int value() {
        return sum;
    }
}


interface IA{
    public void cry();
}