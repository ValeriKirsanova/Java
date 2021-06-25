/**
 * Напишите программу, которая позволит решить простое уравнение относительно x.
 * Программа принимает на вход строку длиной 5 символов.
 * Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
 * Первым, третьим и пятым символом являются две цифры (от 0 до 9)
 * и буква ‘x’ (обозначает неизвестное) в любом порядке.
 * Нужно найти неизвестное.
 */

import java.util.Scanner;

public class FinalTaskWork02 {
    public static void main(String[] args) {
        //ввод уравнения
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение");
        String example = scanner.nextLine();
        //проверяем, что на вход подана строка длиной 5 символов
        if (example.length() == 5) {
            //проверяем, что вторым символом строки является знак ‘+’ или ‘-’
            if ((example.charAt(1) == '+') | (example.charAt(1) == '-')) {
                //проверяем, что четвертый символ строки ‘=’
                if (example.charAt(3) == '=') {
                    //если первым символом является 'х', а третьим и пятым цифры от 0 до 9
                    if (((example.charAt(0) == 'x') &&
                            ((0 <= Character.getNumericValue(example.charAt(2))) && (Character.getNumericValue(example.charAt(2)) <= 9))) &&
                            ((0 <= Character.getNumericValue(example.charAt(4))) && (Character.getNumericValue(example.charAt(4)) <= 9))) {
                        //и если арифметический символ '+'
                        if (example.charAt(1) == '+') {
                            //выполняем вычитание третьего символа из пятого
                            System.out.println("x=" + ((Character.getNumericValue(example.charAt(4))) - (Character.getNumericValue(example.charAt(2)))));
                        } else {
                            //если '-', то выполняем сложение третьего и пятого символов
                            System.out.println("x=" + ((Character.getNumericValue(example.charAt(2))) + (Character.getNumericValue(example.charAt(4)))));
                        }
                    }
                    //если третьим символом является 'х', а первым и пятым цифры от 0 до 9
                    else if (((example.charAt(2) == 'x') &&
                            ((0 <= Character.getNumericValue(example.charAt(0))) && (Character.getNumericValue(example.charAt(0)) <= 9))) &&
                            ((0 <= Character.getNumericValue(example.charAt(4))) && (Character.getNumericValue(example.charAt(4)) <= 9))) {
                        //и если арифметический символ '+'
                        if (example.charAt(1) == '+') {
                            //выполняем вычитание первого символа из пятого
                            System.out.println("x=" + ((Character.getNumericValue(example.charAt(4))) - (Character.getNumericValue(example.charAt(0)))));
                        } else {
                            //если '-',выполняем вычитание пятого символа из первого
                            System.out.println("x=" + ((Character.getNumericValue(example.charAt(0))) - (Character.getNumericValue(example.charAt(4)))));
                        }
                    }
                    //если пятым символом является 'х', а первым и третьим цифры от 0 до 9
                    else if (((example.charAt(4) == 'x') &&
                            ((0 <= Character.getNumericValue(example.charAt(0))) && (Character.getNumericValue(example.charAt(0)) <= 9))) &&
                            ((0 <= Character.getNumericValue(example.charAt(2))) && (Character.getNumericValue(example.charAt(2)) <= 9))) {
                        //и если арифметический символ '+'
                        if (example.charAt(1) == '+') {
                            System.out.println("x=" + ((Character.getNumericValue(example.charAt(0))) + (Character.getNumericValue(example.charAt(2)))));
                        } else {
                            System.out.println("x=" + ((Character.getNumericValue(example.charAt(0))) - (Character.getNumericValue(example.charAt(2)))));
                        }
                    }
                    else {
                        System.out.println("Аргументы уравнения не соответствуют заданным условиям!");
                    }
                } else {
                    System.out.println("Отсутсвует знак равенства!");
                }
            } else {
                System.out.println("Некорретный арифметический знак!");
            }
        } else {
            System.out.println("Уравнение превышает заданный размер");
        }

    }
}
