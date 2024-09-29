import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Факториал числа " + n + " равен " + fact);
    }
}

