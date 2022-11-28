package practice4;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
        }
    }
}
