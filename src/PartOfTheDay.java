import java.util.Scanner;

public class PartOfTheDay {

    public static void main(String[] args) {
        System.out.println("Input key" + "/n");
        Scanner inputOnKeyboard = new Scanner(System.in);
        int N = inputOnKeyboard.nextInt();
        if (N > 0 && N <= 12) {
            System.out.println("Добрий ранок");
        }
        if (N > 12 && N <= 20) {
            System.out.println("Добрий день");
        }
        if (N > 20 && N <= 24) {
            System.out.println("Добрий вечір");
        } else {
            System.out.println("неправильний час");
        }
    }
}