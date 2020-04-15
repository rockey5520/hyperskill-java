import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.next();
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();

        System.out.println(line1.substring(startIndex,endIndex+1));


    }
}