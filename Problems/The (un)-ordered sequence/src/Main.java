import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isOrdered(scanner.nextLine()));
    }
    public static boolean isOrdered(String str){
        String[] myStrArray = str.substring(0,str.length()-2).split(" ");
        if (myStrArray.length <= 2 ) return true;
        boolean asc = true;
        boolean desc = true;
        // Check ascending
        for (int i = 0; i < myStrArray.length-1; i++) {
            if (!(Integer.parseInt(myStrArray[i]) >= Integer.parseInt(myStrArray[i + 1]))) {
                asc = false;
                break;
            }
        }
        // Check descending
        for (int i = 0; i < myStrArray.length-1; i++) {
            if (!(Integer.parseInt(myStrArray[i]) <= Integer.parseInt(myStrArray[i + 1]))){
                desc = false;
                break;
            }
        }
        return  asc || desc;
    }
}