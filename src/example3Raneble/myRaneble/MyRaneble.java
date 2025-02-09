package example3Raneble.myRaneble;

public class MyRaneble implements Runnable{
   Thread thread;
    String name;
    public MyRaneble(String name) {
        System.out.println("MyRaneble Constructor " +name);
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        doSomething();
    }

    private void doSomething() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("error sleep");
            }
        }
    }
}
