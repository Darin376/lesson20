package example4_sinc.mySinc;

public class Producer  implements Runnable{
    //производителль ложит товар
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        putProductTOStore();
    }

    private void putProductTOStore() {
        for (int i = 1; i < 6; i++) {
            store.put();
        }
    }
}
