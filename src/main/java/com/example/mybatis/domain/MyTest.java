package com.example.mybatis.domain;

import java.util.HashMap;
import java.util.Map;

public class MyTest {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("小翔",210);
        map.put("小俐",160);
        map.put("小黑",720);

        map.forEach((k,v) -> System.out.println(k + " : " + v));

        map.keySet().forEach(System.out::println);
        map.forEach((k,v) -> System.out.println(k));

        Dog dog = new Dog("1",10,"2");
        System.out.println(dog.toString());
    }
}

class Dog{//extends Object -》 toString() -> 类型@XXX
    String name;
    int age;
    String type;

    public Dog(String name,int age,String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }

/*    @Override
    public String toString(){
        return name + "属于" + type + "种类 今年" + age + "岁";
    }*/

    }
