//Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
//Посчитайте среднее арифметическое элементов массива.
//После этого произведите вывод массива на экран,
//где каждый элемент массива умножается на среднее арифметическое

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class TaskWork09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.###");

        double sum = 0;
        double average = 0;

        System.out.println("Введите размер массива: ");
        int lenght = input.nextInt();
        double array[] = new double[lenght];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < lenght; i++) {
            array[i] = input.nextDouble();
            sum+=array[i];
        }
        average = sum / array.length;
        int i=0;
        System.out.print("Результат работы программы: ");
        do {
            System.out.printf(decimalFormat.format(array[i]*=average) + "\t");
        } while (++i<array.length);
    }
}
