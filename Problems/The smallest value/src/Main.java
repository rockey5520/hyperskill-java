import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long M = scanner.nextLong();;
        int n = 0;
        while (1 == 1){
            if(factorial(n) > M){
                break;
            }else{
                n++;
                continue;
            }

        }
        System.out.println(n);
    }

    public static long factorial(int number) {
        long result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }
}