package homework_example1.myThreadHomwork1;

import homework_example1.minMaxResult.MinMaxResult;
import homework_example1.service.ServiceHomework1;

import java.util.List;

public class MyThreadHomeworkMin extends Thread {


    private List<Integer> list;
    private MinMaxResult result;

    public MyThreadHomeworkMin(List<Integer> list, MinMaxResult result) {
        this.list = list;
        this.result = result;
    }

    @Override
    public void run() {
        int min = list.stream().min(Integer::compare).orElseThrow();
        result.setMin(min);
    }
}
