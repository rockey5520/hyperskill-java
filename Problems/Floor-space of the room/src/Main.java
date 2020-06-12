import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String input = scanner.next();
        switch (input){
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                calculateTriangeFloorage(a,b,c);
                break;
            case "rectangle":
                double d = scanner.nextDouble();
                double e = scanner.nextDouble();
                calculateRectangleFloorage(d,e);
                break;
            case "circle":
                double r = scanner.nextDouble();
                calculateCircleFloorage(r);
                break;
        }
    }

    private static void calculateCircleFloorage(double r) {
        System.out.println((3.14*r*r));
    }

    private static void calculateRectangleFloorage(double a, double b) {
        System.out.println(a*b);
    }

    private static void calculateTriangeFloorage(double a, double b, double c) {
        if((a+b)>c && (a+c)>b && (b+c)>a){
            double s= (a+b+c)/2;
            double  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println(area);
        }
    }
}