package com.example.mybatis.thread;

public class TestActiveCount{
    public static void main(String[] args){
        int lucky = (int)(Math.random()*10);
        for(int i = 0;i<lucky;i++){
            EtoakThread et = new EtoakThread();
            et.start();
        }
        //突然 很想知道 究竟启动了多少个线程...;		\
        System.out.println(Thread.activeCount());

    }
}
class EtoakThread extends Thread{
    @Override
    public void run(){
        for(int i = 0;i<1;i++){
            System.out.println("Etoak Viva Viva Viviva");
        }
    }
}
