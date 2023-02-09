package com.example.mybatis.test;

public class Test9 implements Runnable{
    Test8 test8;
    public Test9(Test8 t){
        this.test8 = t;
    }
    @Override
    public void run() {
        while(test8.x > 100){
            test8.qt(100);
        }
    }
}
