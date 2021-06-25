//Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
//а после этого произведите вывод первой строки матрицы на экран,
//где каждый элемент умножается на 3. Размерность матрицы задается пользователем.

import java.util.Scanner;

public class TaskWork10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите количество строк матрицы: ");
        int str = input.nextInt();
        System.out.println("Введите количество столбцов матрицы: ");
        int stb = input.nextInt();
        int [][] matrix = new int [str][stb];

        System.out.println("Заполните матрицу: ");
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                matrix[i][j] = input.nextInt();
            }
        }
        int i = 0;
        int j = 0;
        System.out.print("Результат работы программы: ");
        do {
            System.out.printf(matrix[i][j] * 3 + "\t");
        } while (++j < matrix[i].length);
    }
}
