import java.util.Scanner;

public class PrimesInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число (A): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число (B): ");
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i + " простое число");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}


