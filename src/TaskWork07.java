//Напишите программу:
//1. Пользователь вводит размер массива и данные с клавиатуры в массив
//2. Сравнить элементы массива с заранее заданными константами x, y, z.
//3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".

import java.util.Scanner;

public class TaskWork07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = 11;
        int y = 22;
        int z = 33;

        System.out.println("Введите размер массива: ");
        int lenght = input.nextInt();
        int array[] = new int[lenght];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < lenght; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < lenght; i++) {
            if (array[i] == x | array[i] == y | array[i] == z){
                System.out.println("Данное значение имеется в константах");
                return;
            }
        }
    }
}
