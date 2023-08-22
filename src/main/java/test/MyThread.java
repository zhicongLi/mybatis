package test;


class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread " + i + " is running");
        }
    }
}

class TestT {
    public static void main(String[] args) {
        int numThreads = 10;
        MyThread[] threads = new MyThread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new MyThread();
            threads[i].start();
        }
    }
}
