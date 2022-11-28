package practice4;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        while (num > 0) {
            System.out.println(num % 10);
            num /= 10;
        }
    }
}
