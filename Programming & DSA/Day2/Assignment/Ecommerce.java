package Day2.Assignment;

import java.util.Scanner;

public class Ecommerce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter Age: ");
        int age = sc.nextInt();
        System.err.println("Enter Total Purchase Amount: ");
        double amount = sc.nextDouble();

        double flatDiscountAmount = 0;
        double additionalDiscount = 0;

        if (age > 12 && age <= 19) {
            flatDiscountAmount = amount * 0.05 + amount;
            if (amount > 5000) {
                additionalDiscount = flatDiscountAmount * 0.05 + flatDiscountAmount;
                System.out.println("Total Amount After Discount: " + additionalDiscount);
            } else {
                System.out.println("Total Amount After Discount: " + flatDiscountAmount);
            }
        } else if (age > 20 && age < 30) {
            flatDiscountAmount = amount * 0.06 + amount;
            if (amount > 4000) {
                additionalDiscount = flatDiscountAmount * 0.06 + flatDiscountAmount;
                System.out.println("Total Amount After Discount: " + additionalDiscount);
            } else {
                System.out.println("Total Amount After Discount: " + flatDiscountAmount);
            }
        } else if (age > 29) {
            flatDiscountAmount = amount * 0.15 + amount;
            System.out.println("Total Amount After Discount: " + flatDiscountAmount);
        } else {
            System.out.println("Not Eligible");
        }

    }
}
