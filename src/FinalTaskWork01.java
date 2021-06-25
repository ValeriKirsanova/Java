/**
 * Напишите программу конвертер валют.
 * Программа должна переводить рубли в доллары по текущему курсу.
 * Пользователь вводит текущий курс и количество рублей.
 * Итоговое значение должно быть округлено до двух знаков после запятой.
 */

import java.math.BigDecimal;
import java.util.Scanner;

public class FinalTaskWork01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int digits = 2;

        System.out.println("Введите текущий курс доллара: ");
        double dol = input.nextDouble();

        System.out.println("Введите количество рублей: ");
        int rub = input.nextInt();

        System.out.println("Курс доллара: " + dol + "\n"
                + "Количество рублей: " + rub + "\n"
                + "Итого: " + new BigDecimal(""+(rub/dol)).setScale(digits, BigDecimal.ROUND_HALF_UP) + " долларов");
    }
    //округление Double с помощью метода BigDecimal
    public BigDecimal roundUp(double value, int digits){
        return new BigDecimal(""+value).setScale(digits, BigDecimal.ROUND_HALF_UP);
    }
}
