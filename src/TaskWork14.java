//Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20.
//Далее:
//Выведите максимальный и минимальный элемент массива.
//Из максимального и минимального значения выведите наибольшее по модулю.

public class TaskWork14 {
    public static void main(String[] args) {

        int [] array = new int [15];
        int MaxValue = 0;
        int MinValue = 0;

        //заполняем массив рандомными значениями в диапазоне от -20 до 20
        for (int i=0; i< array.length;i++){
            array[i]=getRandomIntegerBetweenRange(-20,20);
            //получаем максимальный элемент массива
            if (array[i]>MaxValue) {
                MaxValue=array[i];
            }
            //получаем минимальный элемент массива
            else if (array[i]<MinValue){
                MinValue=array[i];
            }
        }
        System.out.println("Максимальный элемент массива: " + MaxValue);
        System.out.println("Минимальный элемент массива: " + MinValue);

        //сравниваем элементы массива по модулю
        if (Math.abs(MaxValue)>Math.abs(MinValue)){
            System.out.println("Максимальный элемент по модулю: " + MaxValue);
        }
        else if (Math.abs(MaxValue)<Math.abs(MinValue)) {
            System.out.println("Максимальный элемент по модулю: " + MinValue);
        }
        else {
            System.out.println("Элементы равны по модулю.");
        }

    }
    //метод генерации случайного целочисленного значения в указанном диапазоне
        public static int getRandomIntegerBetweenRange(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
}
