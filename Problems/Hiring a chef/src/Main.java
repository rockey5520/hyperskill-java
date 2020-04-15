import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String age = scanner.next();
        String education = scanner.next();
        String yearsOfExperience = scanner.next();
        String cusinePreference = scanner.next();
        System.out.println("The form for "+ name +" is completed. We will contact you if we need a chef that cooks "+ cusinePreference + " dishes.");
    }
}