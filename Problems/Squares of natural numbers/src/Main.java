import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n ; i++) {
            if((i*i) <= n){
                System.out.println(i*i);
            }else {
                System.exit(0);
            }
        }

    }
}