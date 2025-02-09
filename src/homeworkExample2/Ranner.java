package homeworkExample2;

public class Ranner {
    public static void main(String[] args) {
        System.out.println("Start");
        MyThread1 myThread1 = new MyThread1("Pavel1");
        MyThread2 myThread2 = new MyThread2("Pavel2");
        myThread1.start();
        myThread2.start();

        try {
            myThread2.join();
            myThread1.join();
        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("End");
    }
}
