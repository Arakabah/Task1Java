import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " является числом Армстронга.");
        } else {
            System.out.println(num + " не является числом Армстронга.");
        }
    }

    private static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }
}
