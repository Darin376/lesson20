package homework_example1.ranner;

import homework_example1.minMaxResult.MinMaxResult;
import homework_example1.myThreadHomwork1.MyThreadHomeworkMax;
import homework_example1.myThreadHomwork1.MyThreadHomeworkMin;
import homework_example1.service.ServiceHomework1;

import java.util.List;

public class Ranner {
    public static void main(String[] args) {
        // Вводим массив
        List<Integer> list = ServiceHomework1.intMass();

        // Создаем объект для хранения результатов
        MinMaxResult result = new MinMaxResult();

        // Создаем и запускаем потоки
        MyThreadHomeworkMin myThreadHomeworkMin = new MyThreadHomeworkMin(list, result);
        MyThreadHomeworkMax myThreadHomeworkMax = new MyThreadHomeworkMax(list, result);

        myThreadHomeworkMin.start();
        myThreadHomeworkMax.start();

        try {
            // Ожидаем завершения потоков
            myThreadHomeworkMin.join();
            myThreadHomeworkMax.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Выводим результаты
        System.out.println("Минимальное значение: " + result.getMin());
        System.out.println("Максимальное значение: " + result.getMax());
    }
}
