//Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
// Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
//Выведите слова, состоящие только из латиницы.
//Выведите количество этих слов.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TaskWork13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String phrase = scanner.nextLine();
        //разделяем введенную строку на массив строк по заданному регулярному выражению
        String[] array = phrase.split(" ");

        int count =0;

        for (int i = 0; i < array.length; i++) {
            //выводим слова, состоящие только из латиницы
            Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
            Matcher matcher = pattern.matcher(array[i]);
            if (matcher.matches()){
                System.out.print(array[i] + " ");
                count++;
            }
        }
        //выведим количество этих слов
        if (count!=0)
        System.out.println("- " + count + " шт.");
    }
}
