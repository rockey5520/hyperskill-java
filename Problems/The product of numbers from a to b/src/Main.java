// Posted from EduTools plugin
import java.util.*;
import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long product = 1;
        for (int i = a; i < b ; i++) {
            product = (product*i);
        }
        System.out.println(product);
    }
}