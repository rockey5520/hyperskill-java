import java.util.*;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int k = scanner.nextInt();

    boolean exists = false;

    for (int i = 0; i < n; i++) {
      if ((i * m == k)) {
        exists = true;
        break;
      }
    }
    for (int i = 0; i < m; i++) {
      if ((i * n == k)) {
        exists = true;
        break;
      }
    }

    if (exists) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }
}