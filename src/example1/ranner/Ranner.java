package example1.ranner;

public class Ranner {
    public static void main(String[] args) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("error");
        }

        System.out.println("Start");


      Thread myT =  Thread.currentThread();

        System.out.println(myT);
        myT.setPriority(10);
        myT.setName("myT27");
        System.out.println(myT);



        System.out.println("End");
    }
}
