import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator;
        double num1, num2, result;
        Scanner input = new Scanner(System.in);
        System.out.println("первое число");
        num1 = input.nextDouble();
        System.out.println();
        operator = input.next().charAt(0);
        System.out.println();
        num2 = input.nextDouble();

        switch (operator) {

            case '+':
                result = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + result);
                break;

            default:
                System.out.println("невірний мт оператор");
        }
    }
}