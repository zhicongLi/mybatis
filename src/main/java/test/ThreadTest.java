package test;

class ThreadTest {

    public static void main(String[] args) {
        // 创建线程
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread 1 is running.");
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread 2 is running.");
            }
        });

        // 启动线程
        thread1.start();
        thread2.start();
    }
}
