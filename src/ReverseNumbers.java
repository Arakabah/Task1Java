import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}

