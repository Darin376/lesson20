package example4_sinc.mySinc;

/**
 * ПОтребитель будет пукупать товар
 */
public class Consumer implements Runnable {

    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        getProductFromStore();
    }


    private void getProductFromStore() {
        for (int i = 0; i < 6; i++) {
            store.get();
        }
    }

}
