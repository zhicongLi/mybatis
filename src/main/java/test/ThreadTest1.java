package test;

/**
 * 多线程的创建
 * @autor lzc
 * @create 2023-02-22 1:45 下午
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
        for (int i = 0; i < 100 ; i++) {
            if(i % 2 != 0){
                System.out.println(i + "****************");
            }
        }
    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
