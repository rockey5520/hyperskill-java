import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNext()){
            int i = scanner.nextInt();
            sum = sum + i;
            if(i == 0){
                break;
            }
        }
        System.out.println(sum);

    }
}