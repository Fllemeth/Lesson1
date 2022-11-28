package practice2;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num%2==0) System.out.println("chetnoe");
        if ((num&1)!=1) System.out.println("chetnoe");
        else System.out.println("ne chet");
    }
}
