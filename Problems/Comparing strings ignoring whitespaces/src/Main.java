// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().trim().replace(" ", "");
        String b = scanner.nextLine().trim().replace(" ", "");
        System.out.println(a.equals(b));
    }
}