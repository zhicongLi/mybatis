package com.example.mybatis.test;

public class Test5 {
    public static void main(String[] args) {
        After90 aa = new After90();
        aa.research();
    }

}
class After60 {//60后

    public void research() {//研究
        System.out.println("去图书馆查阅");
        System.out.println("找村长");
    }

}
class After90 extends After60{
    @Override
    public void research(){
        System.out.println("百度一下 你就知道");
//super:表示在子类里面调用一下父类的某个方法
        super.research();
    }
}

