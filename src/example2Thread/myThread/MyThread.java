package example2Thread.myThread;

public class MyThread extends Thread {

    private String threadName;



    public MyThread(String threadName) {
        this.threadName = threadName;
    }



    @Override
    public void run() {
        doSomething();
    }


    private void doSomething() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread "+this.threadName + " " +i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("error sleep");
            }
        }
    }
}
