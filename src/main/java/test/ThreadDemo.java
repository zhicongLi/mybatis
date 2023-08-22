package test;

/**
 * @autor lzc
 * @create 2023-02-22 2:52 下午
 */
public class ThreadDemo {

    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        MyThread3 t2 = new MyThread3();
        t1.start();
        t2.start();
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
