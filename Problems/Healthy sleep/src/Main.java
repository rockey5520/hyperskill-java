// Posted from EduTools plugin
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min_hours = scanner.nextInt();
        int max_hours = scanner.nextInt();
        int slept_hours = scanner.nextInt();

        if(slept_hours >= min_hours && slept_hours <= max_hours){
            System.out.println("Normal");
        }else if( slept_hours < min_hours){
            System.out.println("Deficiency");
        }else if( slept_hours > max_hours){
            System.out.println("Excess");
        }


    }
}