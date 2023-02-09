package com.example.mybatis.test;

public class PublicStatic {
    public static void main(String[] args) {
        //利用静态变量 完成数据共享
        Boy hxm = new Boy();
        Girl ab = new Girl();
        hxm.drink();
        ab.drink();

    }
}

class Cinema{
    static Object cola = new Object();
}
class Boy{
    public void drink(){
        System.out.println(Cinema.cola);
    }
}
class Girl{
    public void drink(){
        System.out.println(Cinema.cola);
    }
}

