package example2Thread.ranner;

import example2Thread.myThread.MyThread;

public class Ranner {
    public static void main(String[] args) {
        System.out.println("Start");


        MyThread t1 = new MyThread("thread1");
        t1.start();
        MyThread t3 = new MyThread("thread2");
        t3.start();
        MyThread t2 = new MyThread("thread3");
        t2.start();



        System.out.println("End");
    }
}
