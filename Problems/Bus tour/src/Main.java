import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int counter = 1;
            while (scanner.hasNext()){
                int bridgeHeight = scanner.nextInt();
                if(busHeight >= bridgeHeight){
                    System.out.println("Will crash on bridge "+ counter);
                    System.exit(0);
                }else{
                    counter++;
                }
            }
        System.out.println("Will not crash");
    }
}