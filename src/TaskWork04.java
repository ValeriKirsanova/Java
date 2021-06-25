//Написать программу, которая будет выполнять следующие действия:
//1. Ввести три числа с клавиатуры x, y, z
//2. Найти и вывести в консоль среднее арифметическое этих чисел.
//3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
//4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"

import java.util.Scanner;

public class TaskWork04 {

    public static void main(String[] args) {
        System.out.println("Введите x: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Введите y: ");
        int y = scanner.nextInt();
        System.out.println("Введите z: ");
        int z = scanner.nextInt();

        int [] num = new int [] {x,y,z};

        if (num.length > 0)
        {
            double sum = 0;
            for (int i = 0; i < num.length; i++) {
                sum += num[i];
            }
            double average = sum / num.length;
            System.out.println("Среднее арифметическое: " + average);

            average /= 2;
            double result = Math.floor(average);
            if (result>3) {
                System.out.println("Программа выполнена корректно ");
                return;
            }
        }
    }

}
