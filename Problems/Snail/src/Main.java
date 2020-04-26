// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poleHeight = scanner.nextInt();
        int climb = scanner.nextInt();
        int down = scanner.nextInt();
        int totalDaily = climb - down;
        int days = 0;
        while(poleHeight >0){
            if (poleHeight <=climb){
                days = days+1;
                break;
            }
            poleHeight = poleHeight -totalDaily;
            days = days+1;
        }
        System.out.println(days);
    }
}