package example4_sinc.mySinc;

/**
 * склад товаров
 */
public class Store {

    private int productCount = 0;

    public synchronized void  get() {
        while (productCount<1){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        };


        productCount--;
        System.out.println("Забрали 1 товарар");
        System.out.println("Осталось товаров " + productCount);
        notify();
    }

    public synchronized void put() {
        while (productCount>=5){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        productCount++;
        System.out.println("Положтлт 1 товар");
        System.out.println("Осталось товаров " + productCount);
        notify();
    }

}
