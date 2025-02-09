package homeworkExample2;

public class MyThread1 extends Thread {
    private String name;

    public MyThread1(String name) {
        this.name = name;
    }

    public void  run(){
        goto1();
    }

    private void goto1(){
        int count = 0;
       for (int i =0; i<5; i++) {
           count++;
            System.out.println("MyThread1 " + count);
        }
    };
}
