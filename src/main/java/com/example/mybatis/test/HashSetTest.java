package com.example.mybatis.test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        String str1 = new String("test");
        String str2 = new String("test");
        System.out.println(str1 == str2);//?
        set.add(str1);
        set.add(str2);
        System.out.println(set.size());

        Set<Integer> set1 = new HashSet<>();
        Integer num1 = new Integer(777);//Integer.valueOf(777);
        Integer num2 = new Integer(777);
        System.out.println(num1 == num2);//false
        set1.add(num1);
        set1.add(num2);
        System.out.println(set1.size());

    }
}
