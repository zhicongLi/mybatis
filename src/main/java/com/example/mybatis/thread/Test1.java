package com.example.mybatis.thread;

public class Test1 extends Thread{

    static int x = 100;

    static Object object = "aa";

    public Test1(String name){
        super(name);
    }

    @Override
    public void run() {
        while(x > 0){
            synchronized (object){
                if(x > 0){
                    System.out.println(getName() + "卖出了第" + x + "张票");
                    x -= 1;
                }else{
                    System.out.println("票已卖完");
                }
            }
            try{
               sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
