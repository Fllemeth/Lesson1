import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        zvezdochka();
    }

    public static void heron() {
        Scanner read = new Scanner(System.in);
        System.out.println("enter triangle sides");
        double a = read.nextDouble();
        double b = read.nextDouble();
        double c = read.nextDouble();

        double p = (a+b+c)/2;
        System.out.println("triangle area is: " + sqrt(p*(p-a)*(p-b)*(p-c)));
    }

    public static void areaVolume() {
        Scanner read = new Scanner(System.in);
        System.out.println("enter cube side");
        double a = read.nextDouble();

        System.out.println("cube area is: " + 6*pow(a, 2));
        System.out.println("cube volume is: " + pow(a, 3));
    }

    public static void strings() {
        String name = "Borys";
        String surname = "Bohomolov";
        String fathername = "Nikolayevich";
        String prlanguage = "Java";
        int age = 22;
        String salary = "3000 bucks";

        System.out.println(surname+"\n"+name+"\n"+fathername+"\n"+prlanguage);
        System.out.println(surname+" "+name+" "+fathername);
        System.out.print(age+" "+salary);
    }

    public static void zvezdochka() {
        Scanner read = new Scanner(System.in);
        System.out.println("enter 5 digits number");
        int a = read.nextInt();
        int b = 0;
        for(int i=1; i<=5; i++) {
            b+=a%10;
            a/=10;
        }
        System.out.println(b);
    }

    public static void minmax(double a, double b) {
        if(a > b) {
            System.out.println("max is" + a + "min is" + b);
        } else {
            System.out.println("max is" + b + "min is" + a);
        }
    }

    public static void minmaxav(double a, double b, double c) {
        double[] mas = {a, b, c};
        Arrays.sort(mas);
        System.out.println("max is" + mas[2] + "min is" + mas[0] + "average is: " + mas[1]);
    }

}