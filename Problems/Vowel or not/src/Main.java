import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        String[] items = new String[]{"a","e","i","o","u"};
        return Arrays.stream(items).parallel().anyMatch(Character.toString(ch).toLowerCase()::contains);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}