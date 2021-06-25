/**
 * Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
 * Среди данных строк найти строку с максимальным количеством различных символов.
 * Если таких строк будет много, то вывести первую.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FinalTaskWork03 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        int count = 0;
        int MaxValue = 0;
        Character sign = null;
        String sentence = null;
        String newSent = null;

        //пользователь вводит  количество строк str
        System.out.println("Введите количество строк: ");
        int str = Integer.parseInt(reader.readLine());

        //затем сами строки
        for (int i = 1; i <= str; i++) {
            System.out.println("Строка " + i);
            list.add(reader.readLine());
        }

        //просматриваем каждую строку
        for (int n = 0; n < list.size(); n++) {
            //удаляем из строки пробелы
            newSent = list.get(n).replaceAll(" ", "");
            //получаем новую длину строки и записываем ее в переменную count
            count=newSent.length();
            //получаем каждый символ с начала строки
            for (int m = 0; m < newSent.length()-1; m++) {
                //получаем каждый символ с конца строки
                for (int l=newSent.length()-1; l>0; l--){
                    //сравниваем символ с каждым последующим в этой строке
                    if (newSent.charAt(m)==newSent.charAt(l)){
                        //если символ не уникален, уменьшаем количество символов строки
                        //в итоге должно остаться количество уникальных символов
                        count--;
                    }
                }
            }
            //сравниваем количество уникальных символов в строке с максимальным
            if (count>MaxValue){
                //если новое значение больше предыдущего, то присваиваем его переменной MaxValue
                MaxValue=count;
                //в переменную sentence записываем строку, которая имеет максимальную уникальность
                sentence=list.get(n);
            }
            //обнуляем переменную count для записи длины следующей строки
            count=0;
        }
        //вывод строки с максимальным значением различных символов
        System.out.println(sentence);
    }
}
