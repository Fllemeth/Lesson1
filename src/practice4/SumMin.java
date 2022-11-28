package practice4;

import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        while (A>=B) {
            System.out.println("A should be less than B and not equal than B");
            A = in.nextInt();
            B = in.nextInt();
        }
        while (A<=B) {
            System.out.println(A++);
        }
    }
}
