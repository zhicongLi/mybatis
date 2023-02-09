package com.example.mybatis.StringTest;

public class StrTest {
    public static void main(String[] args){
      /*  String str = "Etoa95f";
        String x = "etoa95F";

        if(str.equalsIgnoreCase(x)){
            System.out.println("验证码正确");
        }else{
            System.out.println("验证码输入错误");
        }*/

      /*  String str = "etoak.com.com.com";

        //.com -> .cn

        String x = str.replace(".com",".cn");
        String y = str.replaceAll(".com",".cn");

        System.out.println(x);
        System.out.println(y);*/

        String str = "etoak";

        //oak
        int x = str.indexOf("o");
        //String x = str.substring(2,5);//2 3 4
        System.out.println(x);


    }
}
