import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число (A): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число (B): ");
        int b = scanner.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Сумма четных чисел от " + a + " до " + b + " равна " + sum);
    }
}

