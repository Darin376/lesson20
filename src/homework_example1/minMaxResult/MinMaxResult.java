package homework_example1.minMaxResult;

public class MinMaxResult {

    private int min;
    private int max;

    public synchronized void setMin(int min) {
        this.min = min;
    }

    public synchronized void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

};
