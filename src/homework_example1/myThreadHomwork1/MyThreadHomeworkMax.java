package homework_example1.myThreadHomwork1;

import homework_example1.minMaxResult.MinMaxResult;

import java.util.List;

public class MyThreadHomeworkMax extends Thread {
    private List<Integer> list;
    private MinMaxResult result;

    public MyThreadHomeworkMax(List<Integer> list, MinMaxResult result) {
        this.list = list;
        this.result = result;
    }

    @Override
    public void run() {
        int max = list.stream().max(Integer::compare).orElseThrow();
        result.setMax(max);
    }

}
