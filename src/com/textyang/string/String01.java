package com.textyang.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

/**
 * @author 28262
 */
@SuppressWarnings("all")
public class String01 {
    public static void main(String[] args) throws ParseException {
        String name = "Yang";
        String name2 = "Yang";
        char [] a = {};
        char b[] = {};
//    char c[0] = {'a'};
        char d[] = {'a','.','s','b','d','e','f','c'};
        char[] ae = name.toCharArray();
        int [] m[] = new int[5][0];
        System.out.println(ae);
        a = Arrays.copyOf(d,100);
        System.out.println(a);
        Cat cat = new Cat();
        cat.name = "cat";
        cat.age = 2;
        Arrays.sort(d);
        LocalDateTime localDateTime =  LocalDateTime.now();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY年MM月DD日,HH时mm分钟ss秒");
        DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dateTimeFormatter.format(localDateTime));
        String time = "2022-07-29 09:02:44";

        LocalDateTime dat = LocalDateTime.parse(time,dateTimeFormatter);
        LocalDateTime dat2 =  LocalDateTime.from(dateTimeFormatter.parse(time));
        System.out.println("test:"+dateTimeFormatter.format(dat2));

        Date dat3 = new Date();


        
        System.out.println(dat3);




        char[] da = name.toCharArray();

        Cat cat1 = cat;
        cat1.age = 1;
        System.out.println(cat.age);
        Cat cat3 = Cat.copy(cat);
        cat3.name = "cat";
        System.out.println(Arrays.toString(args));

        String x = "abc";
        String y = "abc";
        String z = new String("ababba\\\\abbc");
//        z = "E:\\\\a\\\\b";
        System.out.println("show:"+(x == z));
        System.out.println(x.equals(z));
        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));
        System.out.println(y.intern());
//        z = Arrays.toString(z.split("\\\\a"));
        String[] zi = z.split("\\\\a");
        for(String i :zi){
            System.out.println(i);
        }
        System.out.println(z+":"+ Arrays.toString(z.split("\\\\a")));
        System.out.println(System.identityHashCode(z));
//        try {
//            int i = 1/0;
//        } catch (Exception e) {
//            e.printStackTrace();
//
//            System.out.println(Arrays.toString(e.getStackTrace()));
//        }
        System.out.println(cat.name);
        System.out.println(cat.name == cat1.name);
        System.out.println(cat.name==cat3.name );
    }


}

class Cat{
    String name;
    int age;

    public static Cat copy(Cat cat){
        Cat cat1 = new Cat();
        cat1.age = cat.age;
        cat1.name = cat.name;
        return cat1;
    }
}
