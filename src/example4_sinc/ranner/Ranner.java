package example4_sinc.ranner;

import example4_sinc.mySinc.Consumer;
import example4_sinc.mySinc.Producer;
import example4_sinc.mySinc.Store;

public class Ranner {
    public static void main(String[] args) {
        System.out.println("start");
        Store store = new Store();
        Consumer consumer = new Consumer(store);
        Producer producer = new Producer(store);

        Thread t1 = new Thread(consumer);
        t1.start();
        Thread t2 = new Thread(producer);
        t2.start();
        System.out.println("end");
    }
}
