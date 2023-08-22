package test;

/**
 * @autor lzc
 * @create 2023-02-23 9:32 上午
 */
public class ThreadTest2 {

    public static void main(String[] args) {
        MThread mThread = new MThread();
        Thread t1 = new Thread(mThread);
        t1.start();
    }
}
class MThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
           if(i % 2 == 0){
               System.out.println(i);
           }
        }
    }
}
