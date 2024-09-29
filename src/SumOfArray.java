import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("Сумма всех элементов массива: " + sum);
    }
}

