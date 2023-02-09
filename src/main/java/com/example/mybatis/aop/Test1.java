package com.example.mybatis.aop;

public class Test1 {

    public static void main(String[] args){
        Persion persion = new Persion();
        persion.teacher();
        Test test = new Test(persion);
        test.teacher();
    }
}
