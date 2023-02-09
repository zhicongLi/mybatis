package com.example.mybatis.thread;
class Exec{
    static WK wk = new WK();
    public static void main(String[] args){
        Teacher tea = new Teacher();
        tea.start();

        wk.start();
        WN wn = new WN();
        wn.start();

        WJ wj = new WJ();
        wj.start();
        XBL no3 = new XBL();
        no3.setPriority(1);
        no3.start();
    }
}
class XBL extends Thread{
    @Override
    public void run(){
        for(int i = 0;i<5000;i++){
            System.out.println("蹄儿朝西 驮着唐三藏带着三徒弟..");
        }
    }
}
class WJ extends Thread{
    @Override
    public void run(){
        try{
            Exec.wk.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        for(int i = 0;i<5000;i++){
            System.out.println("大师兄不好了 师傅被妖怪绑走了..");
        }
    }
}
class WN extends Thread{
    @Override
    public void run(){
        try{
            sleep(3000);
        }catch(Exception e){
            e.printStackTrace();
        }
        for(int i = 0;i<5000;i++){
            System.out.println("分行李吧...");
        }
    }
}
class WK extends Thread{
    @Override
    public void run(){
        yield();
        yield();
        yield();
        for(int i = 0;i<5000;i++){
            System.out.println(i);
        }
    }
}
class Teacher extends Thread{
    @Override
    public void run(){
        for(int i = 0;i<5000;i++){
            System.out.println("Only you 能伴我取西经");
        }
    }
}
