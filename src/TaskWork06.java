//Напишите программу конвертер физических величин:

//1. Пользователю предлагается на выбор ввести массу или расстояние.
// Пример:
//> Выберите что переводить: 1 - масса, 2 - расстояние
//> 2

//2. Пользователю предлагается выбрать единицу измерения.
// Пример:
//> Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
//> 1

//3. Пользователю предлагается ввести количество выбранных единиц:
//> Введите число
//> 10
//> Результат:
//> Метры: 10
//> Мили: 0.006
//> Ярды: 10.94
//> Футы: 32.81

import java.text.DecimalFormat;
import java.util.Scanner;

public class TaskWork06 {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        System.out.println("Выберите, что переводить: 1 - масса, 2 - расстояние");
        Scanner in = new Scanner(System.in);
        int variant = in.nextInt();

        switch(variant) {
            case 1:
                System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - унция, 3 - фунт, 4 - карат");
                int unitMass = in.nextInt();
                System.out.println("Введите число");
                double num = in.nextDouble();
                switch (unitMass) {
                    case 1:
                        System.out.println("Килограмм: " + decimalFormat.format(num) + "\n" + "Унция: " + decimalFormat.format(num * 35.27) + "\n" + "Фунт: " + decimalFormat.format(num * 2.2) + "\n" + "Карат: " + decimalFormat.format(num * 5000));
                        break;
                    case 2:
                        System.out.println("Унция: " + decimalFormat.format(num) + "\n" + "Килограмм: " + decimalFormat.format(num * 0.028) + "\n" + "Фунт: " + decimalFormat.format(num * 0.063) + "\n" + "Карат: " + decimalFormat.format(num * 141.75));
                        break;
                    case 3:
                        System.out.println("Фунт: " + decimalFormat.format(num) + "\n" + "Килограмм: " + decimalFormat.format(num * 0.45) + "\n" + "Унция: " + decimalFormat.format(num * 16) + "\n" + "Карат: " + decimalFormat.format(num * 2267.96));
                        break;
                    case 4:
                        System.out.println("Карат: " + decimalFormat.format(num) + "\n" + "Килограмм: " + decimalFormat.format(num * 0.0002) + "\n" + "Унция: " + decimalFormat.format(num * 0.0071) + "\n" + "Фунт: " + decimalFormat.format(num * 0.00044));
                        break;
                    default:
                        System.out.println("Введена некорректная единица измерения!");
                }
                return;
            case 2:
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - фут, 3 - ярд, 4 - миля");
                int unitDistance = in.nextInt();
                System.out.println("Введите число");
                double dist = in.nextDouble();
                switch (unitDistance) {
                    case 1:
                        System.out.println("Метр: " + decimalFormat.format(dist) + "\n" + "Фут: " + decimalFormat.format(dist * 3.28) + "\n" + "Ярд: " + decimalFormat.format(dist * 1.09) + "\n" + "Миля: " + decimalFormat.format(dist * 0.00062));
                        break;
                    case 2:
                        System.out.println("Фут: " + decimalFormat.format(dist) + "\n" + "Метр: " + decimalFormat.format(dist * 0.3) + "\n" + "Ярд: " + decimalFormat.format(dist * 0.33) + "\n" + "Миля: " + decimalFormat.format(dist * 0.00019));
                        break;
                    case 3:
                        System.out.println("Ярд: " + decimalFormat.format(dist) + "\n" + "Метр: " + decimalFormat.format(dist * 0.91) + "\n" + "Фут: " + decimalFormat.format(dist * 3) + "\n" + "Миля: " + decimalFormat.format(dist * 0.00057));
                        break;
                    case 4:
                        System.out.println("Миля: " + decimalFormat.format(dist) + "\n" + "Метр: " + decimalFormat.format(dist * 1609.34) + "\n" + "Фут: " + decimalFormat.format(dist * 5280) + "\n" + "Ярд: " + decimalFormat.format(dist * 1760));
                        break;
                    default:
                        System.out.println("Введена некорректная единица измерения!");
                }
            default:
                System.out.println("Вы ввели некорректное значение!");
                break;
        }

        }
    }

