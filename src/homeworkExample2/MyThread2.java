package homeworkExample2;

public class MyThread2 extends Thread {
    String name;

    public MyThread2(String name) {
        this.name = name;
    }

    public void  run(){
        goto1();
    }
    private void goto1(){
        int count = 0;
        for (int i =0; i<5; i++) {
            count++;
            System.out.println("MyThread2 " + count);
        }
    };
}
