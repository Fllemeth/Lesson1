import java.util.Scanner;

public class Discriminant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double D = 0;
        double x1, x2;
        D = Math.pow(b,2) - 4*a*c;
        if (D > 0) {
            x1 = (-b + Math.sqrt(D))/(2*a);
            x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        }
        if (D == 0) {
            x1 = x2 = (-b + Math.sqrt(D))/(2*a);
        }
        if (D < 0) {
            System.out.println("рішення не існує");
        }
    }
}