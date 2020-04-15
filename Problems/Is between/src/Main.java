import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    if (a >= b && a <= c) {
      System.out.println("true");
    } else if (a <= b && a >= c) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}