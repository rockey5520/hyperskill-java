// Posted from EduTools plugin
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        int n = scanner.nextInt();

        int counter = 0;
        for (int i = min; i <= max ; i++) {
            if(i%n == 0){
                counter++;
            }
        }
        System.out.println(counter);

    }
}