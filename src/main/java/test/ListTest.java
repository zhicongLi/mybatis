package test;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<Dog> list = new ArrayList<>();
        Dog dog = new Dog();
        for(int x = 0;x < 5;x++){
            dog.setName("狗头" + x);
            dog.setAge("年龄" + x);
            list.add(dog);
        }
        System.out.println("=============");
        System.out.println(list);
    }
}
