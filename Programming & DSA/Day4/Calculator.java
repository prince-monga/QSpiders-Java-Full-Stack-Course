package Day4;

import java.util.Scanner;

public class Calculator {
    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int sub(int n1, int n2) {
        return n1 - n2;
    }

    public static int mul(int n1, int n2) {
        return n1 * n2;
    }

    public static int div(int n1, int n2) {
        return n1 / n2;
    }

    public static int mod(int n1, int n2) {
        return n1 % n2;
    }

    public static void main(String[] args) {
        System.out.println("----Calculator----");
        // System.out.println("1 -> Addition (+)");
        // System.out.println("2 -> Subtaction (-)");
        // System.out.println("3 -> Multiplication (*)");
        // System.out.println("4 -> Division (/)");
        // System.out.println("5 -> Moduls (%)");

        System.out.println("chosse operator to perform task: +,-,*,/,% ");
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        int res = 0;
        switch (c) {
            case '+':
                res = add(5, 9);
                break;
            case '-':
                res = sub(5, 9);
                break;
            case '*':
                res = mul(5, 9);
                break;

            case '/':
                res = div(5, 9);
                break;

            case '%':
                res = mod(5, 9);
                break;
            default:
                System.out.println("Invaild operator;");
                break;
        }
        System.out.println("res:" + res);
        sc.close();
    }
}
