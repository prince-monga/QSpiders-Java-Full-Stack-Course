package Day3;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Unit Consumed: ");
        int unit = sc.nextInt();
        double total_amount = 0;
        if (unit > 0 && unit <= 100) {
            total_amount = unit * 2;
        } else if (unit > 100 && unit <= 300) {
            total_amount = unit * 4;
        } else {
            total_amount = unit * 6;
        }

        if (total_amount > 2000) {
            total_amount = total_amount +
                    (total_amount * 0.1);
            System.out.println("Total Bill Amount:" + total_amount);
        } else {
            System.out.println("Total Bill Amount:" + total_amount);
        }

        sc.close();
    }
}
