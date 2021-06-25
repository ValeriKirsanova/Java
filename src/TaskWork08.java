//Напишите программу, где пользователь вводит любое целое положительное число n.
//А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.

import java.util.Scanner;

public class TaskWork08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum=0;
        System.out.println("Введите целое положительное число: ");
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Это отрицательное число!");
        }
        else{
            for (int i=n; i>0; i--){
                if (i%2 == 0){
                    continue;
                }
                sum+=i;
            }
            System.out.println("Сумма всех нечетных чисел введенного числа: " + sum);
        }
    }
}
