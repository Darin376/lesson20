package homework_example1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;


public class ServiceHomework1 {
    public static List<Integer> intMass() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива:");
        int massLength = sc.nextInt();

        System.out.println("Введите числа и нажимайте Enter:");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < massLength; i++) {
            int number = sc.nextInt();
            list.add(number);
        }

        // Не закрываем Scanner здесь, чтобы можно было использовать его в других методах
        return list;
    }


}
