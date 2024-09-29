import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        StringBuilder reversed = new StringBuilder(str);
        System.out.println("Реверс строки: " + reversed.reverse().toString());
    }
}


