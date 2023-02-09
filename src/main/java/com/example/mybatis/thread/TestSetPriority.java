package com.example.mybatis.thread;

import java.util.UUID;

public class TestSetPriority{
    public static void main(String[] args) throws InterruptedException {
        Student s1 = new Student("齐天大圣");
        Student s2 = new Student("天蓬元帅");
        Thread.sleep(100);
        Thread thread = new Thread(s1);
        thread.start();
        Thread thread1 = new Thread(s2);
        thread1.start();
        thread.setPriority(10);//猴哥最高的优先级
        thread1.setPriority(1);//猪哥最低的优先级
    }
}
class Student implements Runnable{
    String name;
    public Student(String name){
        this.name = name;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("我是线程" + name);
        }
    }

    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString().replace("-",""));
    }
}

