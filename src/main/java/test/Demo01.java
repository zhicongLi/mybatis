package test;

import com.alibaba.fastjson.JSONArray;

public class Demo01 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.toString());
        cat.run();
    }
}

    class Animal{
        public void run(){
            System.out.println("我会飞");
        }
    }

    class Cat extends Animal{
        public void run(){
            System.out.println("我不会飞");
            //this.run();
            //super.run();
        }

    }
