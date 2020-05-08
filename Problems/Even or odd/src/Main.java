import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            oddeven(n);
        }
    }

    private static void oddeven(int n) {
        if(n != 0){
            if(n%2 == 0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }else{
            System.exit(0);
        }
    }
}