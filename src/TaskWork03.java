//Выполните следующие действия с массивом:
//1. Задайте массив из 5 любых целых чисел.
//2. Поменяйте местами первый и последний элемент в массиве.
//3. Вывести в консоль результат суммы первого и среднего элемента.
//Примечание : Для получения последнего и среднего элементов в массиве используйте свойство length.

public class TaskWork03 {
    public static void main(String[] args) {
        //Задайте массив из 5 любых целых чисел.
        int [] array1 = {11,22,33,44,55};
        //Поменяйте местами первый и последний элемент в массиве.
        int num  = array1[0];
        array1[0] = array1[array1.length-1];
        array1[4] = num;
        //Вывести в консоль результат суммы первого и среднего элемента.
        System.out.println(array1[0] + array1[array1.length / 2]);
    }
}