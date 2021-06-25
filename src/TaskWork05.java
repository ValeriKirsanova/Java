//Напишите простой калькулятор:
//1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
//2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.

import java.util.Scanner;

public class TaskWork05 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println("Введите второе число: ");
        int y = in.nextInt();
        System.out.println("Введите арифметический оператор: ");
        String z = in.next();

        double result=0;
        switch (z) {
            case "+":
                result = x + y;
                System.out.println("Результат операции: " + Math.round(result));
                break;
            case "-":
                result = x - y;
                System.out.println("Результат операции: " + Math.round(result));
                break;
            case "*":
                result = x * y;
                System.out.println("Результат операции: " + Math.round(result));
                break;
            case "/":
                if (y==0) {
                    System.out.println("На ноль делить нельзя!");
                break; }
                else {
                result = x / y;
                System.out.println("Результат операции: " + Math.round(result));
                break; }
            default:
                System.out.println("Вы ввели некорректный арифметический оператор!");
                break;


        }
    }
}
