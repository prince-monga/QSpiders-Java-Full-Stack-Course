package Day2.Assignment;

import java.util.Scanner;

public class EcomChat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Total Purchase Amount: ");
        double amount = sc.nextDouble();

        double flatDiscount = 0;
        double additionalDiscount = 0;

        double priceAfterFlat;
        double finalPrice;

        if (age >= 13 && age <= 19) {

            flatDiscount = amount * 0.05;
            priceAfterFlat = amount - flatDiscount;

            if (priceAfterFlat > 5000) {
                additionalDiscount = priceAfterFlat * 0.05;
            }

        } else if (age >= 20 && age <= 29) {

            flatDiscount = amount * 0.06;
            priceAfterFlat = amount - flatDiscount;

            if (priceAfterFlat > 4000) {
                additionalDiscount = priceAfterFlat * 0.06;
            }

        } else if (age > 29) {

            flatDiscount = amount * 0.15;
            priceAfterFlat = amount - flatDiscount;

        } else {
            System.out.println("Not Eligible for Discount");
        }

        finalPrice = amount - flatDiscount - additionalDiscount;
        double totalDiscount = flatDiscount + additionalDiscount;

        System.out.println("\nTotal Price Before Discount: " + amount);

        System.out.println("Total Discount Amount: " + totalDiscount);
        System.out.println("Total Price After Discount: " + finalPrice);
        sc.close();
    }
}
