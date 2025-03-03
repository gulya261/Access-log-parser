import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int number2 = new Scanner(System.in).nextInt();

        double quotient = (double) number1/number2;
        int sum = number1 + number2;
        int multi = number1*number2;
        int diff = number1 -number2;
        System.out.println(quotient + " Деление чисел");
        System.out.println(multi + " Умножение чисел");
        System.out.println(sum + " Сумма чисел");
        System.out.println(diff + " Разность");

    }
}