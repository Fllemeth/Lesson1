package practice3;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num >= 0 && num <= 14) {
            System.out.println("number betwen [0-14]");
        }
        else if (num >= 15 && num <= 35) {
            System.out.println("number betwen [15-35]");
        }
        else if (num >= 36 && num <= 50) {
            System.out.println("number betwen [36-50]");
        }
        else if (num >= 50 && num <= 100) {
            System.out.println("number betwen [50-100]");
        } else System.out.println("number is out of bounds");
    }

}

