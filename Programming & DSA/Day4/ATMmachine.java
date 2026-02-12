package Day4;

import java.util.Scanner;

public class ATMmachine {
    public static void main(String[] args) {
        System.out.println("---welcome to ATM---");
        System.out.println("1 -> check Balance");
        System.out.println("2 -> Withdraw");
        System.out.println("3 -> Deposit");
        System.out.println("4 -> Mini Statement");
        System.out.println("5 -> Exit");

        Scanner sc = new Scanner(System.in);
        System.out.println("Select option:");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("check balance");
                break;
            case 2:
                System.out.println("Withdraw");
                break;
            case 3:
                System.out.println("Deposit");
                break;
            case 4:
                System.out.println("Mini Statement");
                break;
            case 5:
                System.out.println("Exist");
                break;
            default:
                break;
        }

        sc.close();
    }
}
