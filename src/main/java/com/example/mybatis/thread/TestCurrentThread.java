package com.example.mybatis.thread;

public class TestCurrentThread {
    public static void main(String[] args){
        NumThread nt = new NumThread();
        CharThread ct = new CharThread();
        nt.start();
        ct.start();
    }
}
class NumThread extends Thread{
    @Override
    public void run(){
        for(int i = 1;i<=26;i++){
            System.out.println(i);
            Thread.yield();
        }
    }
}
class CharThread extends Thread{
    @Override
    public void run(){
        for(char c = 'a';c<='z';c++){
            System.out.println(c);
            //Thread.yield();
        }
    }
}
