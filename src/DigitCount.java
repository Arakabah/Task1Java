import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }

        System.out.println("Количество цифр: " + count);
    }
}

