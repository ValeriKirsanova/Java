//1. Ввести первое  число с клавиатуры и записать его в строковую переменную.
//2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
//3. Сравнить 2 числа и вывести большее на экран .
//4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.

import java.util.Scanner;

public class TaskWork11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        Integer str = input.nextInt();
        String number1 = str.toString();

        System.out.println("Введите второе число: ");
        int number2 = input.nextInt();

        if (number2>Integer.valueOf(number1)){
            System.out.println("Наибольшее число: " + number2);
            System.out.println("Наименьшее число: " + Double.valueOf(number1));
        }
        else if (number2<Integer.valueOf(number1)){
            System.out.println("Наибольшее число: " + Integer.valueOf(number1));
            System.out.println("Наименьшее число: " + Double.valueOf(number2));
        }
        else System.out.println("Числа равны!");
    }

}
