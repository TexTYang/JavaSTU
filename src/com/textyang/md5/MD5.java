package com.textyang.md5;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
//MD5的使用，用于对密码明文的加密
//明文：密码原文，密文：加密的密码
public class MD5 {
    public static void main(String[] args) {
        String password = "admin1234556";
        try {
//          MD5工具类
            MessageDigest md = MessageDigest.getInstance("md5");
//          需要byte数组接收
            byte[] bytes = md.digest(password.getBytes("UTF-8"));
//          输出数组
            System.out.println(Arrays.toString(bytes));
//          String mdstr = new String(bytes);
//
//          a-z A-Z 0-9/* BASE64编码算法，转化成字母和数字的序列，getEncoder转码
            String mdstr = Base64.getEncoder().encodeToString(bytes);
//
            byte[] bytes1 = Base64.getDecoder().decode(mdstr);
            System.out.println(mdstr+"\n"+Arrays.toString(bytes1));


        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }


    }
}
