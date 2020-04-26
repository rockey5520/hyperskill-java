// Posted from EduTools plugin
import java.util.*;
import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n ; i++) {
            list.add(scanner.nextInt());
        }
        for (int i: list
        ) {
            if(i%6== 0 ){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}