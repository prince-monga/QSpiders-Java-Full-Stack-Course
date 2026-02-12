package Day4;

import java.util.Scanner;

public class BankAccount {
    // double bal = 10000;

    public static void main(String[] args) {
        int bal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Welcome to bank Application-----");
        System.out.println("1-> Saving Account");
        System.out.println("2-> Current Account");
        int acc = sc.nextInt();
        switch (acc) {
            case 1: {
                System.out.println("1 -> Deposit");
                System.out.println("2 -> Withdraw");
                System.out.println("3 -> check balance");
                System.out.println("Enter operation number:");
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Enter Ammount:");
                        int am = sc.nextInt();
                        bal += am;
                        System.out.println("Successfully deposit ammount:" + am);
                        break;

                    default:
                        break;
                }
            }
                break;

            case 2:

                break;
            default:
                break;
        }
        sc.close();
    }
}
