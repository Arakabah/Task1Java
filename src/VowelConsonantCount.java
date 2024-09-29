import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (isVowel(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Количество гласных: " + vowels);
        System.out.println("Количество согласных: " + consonants);
    }

    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}

