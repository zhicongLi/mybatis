package com.example.mybatis.test;

import java.sql.SQLOutput;

public class Test8 {
    static int x = 10000;

    public void atm(int y){
        Test8.x -= y;
        System.out.println("atm取款" + y + "元 剩余" + Test8.x + "元" );
    }
    public void qt(int y){
        Test8.x -= y;
        System.out.println("qt取款" + y + "元 剩余" + Test8.x + "元" );
    }
}
class Test implements Runnable{


    Test8 test8;
    public Test(Test8 t){
        this.test8 = t;
    }
    @Override
    public void run() {
        synchronized ("a") {
            while (test8.x > 100) {
                test8.atm(100);
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class test11{
    public static void main(String[] args) {
        Test8 test8 = new Test8();
        Test9 test9 = new Test9(test8);
        Test test = new Test(test8);

        Thread thread = new Thread(test);
        Thread thread1 = new Thread(test9);

        thread.start();
        thread1.start();

    }
}
