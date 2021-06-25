//Напишите программу, принимающую на вход строку “I like Java!!!”,
//которая будет выполнять следующие действия:
//1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
//2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
//3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
//4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
//5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring()).

public class TaskWork12 {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        boolean res1 = str.contains("Java");
        boolean res2 = str.startsWith("I like");
        boolean res3 = str.endsWith("!!!");
        if (res1==res2==res3==true) {
            //вывод строки, преобразованной к верхнему регистру
            String upperPhrase= str.toUpperCase();
            System.out.println(upperPhrase);
            //Замена всех символов ‘a’ на ‘о’
            String newPhrase = str.replace("a",  "o");
            //вывод подстроки “Jovo” на экран
            String word= newPhrase.substring(7, 11);
            System.out.println(word);
        }
    }
}
