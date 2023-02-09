package com.example.mybatis.aop;

public class Test implements Techer{
    Persion p;
    public Test(Persion p){
        this.p = p;
    }

    @Override
    public void teacher() {
        System.out.println("休息时间休息");
    }
}
