package practice4;

import java.util.Scanner;

public class NumTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number from 1 to 9");
        int num = in.nextInt();
        while (num < 1 || num > 9) {
            System.out.println("Number should be from 1 to 9");
            num = in.nextInt();
        }
        for(int i = 1; i<=10; i++){
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }
}
