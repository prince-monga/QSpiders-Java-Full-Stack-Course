import java.util.Scanner;

// customer -- teenager 13-18 --- 5% Discount
// If teenager and total purchase >= 5000 then give additional 5% discount

// if age 20's -- Flat 5%

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter items total Purchase price: ");
        double total_purchase = sc.nextDouble();

        if (age >= 13 && age < 19) {
            
            double flat_discount = total_purchase * 0.05;
            double flat_price = total_purchase - flat_discount;

            if (total_purchase >= 5000) {    // flat_price>=5000 [Not Total_purcahseprice]
                
                double add_discount = flat_price * 0.05;
                double after_discount = flat_price - add_discount;
                 System.out.println("Total Purchase Price: " + total_purchase);
                 System.out.println("Flat 5% Discount: " + flat_discount);
                 System.out.println("Additional 5% Discount: " + add_discount);
                System.out.println("After Discount Purchase Price: " + after_discount);
            } else {
                System.out.println("After Discount Purchase Price: " + flat_price);
            }

        } 
        else if(age>=20 && age<=29){
            double flat_discount = total_purchase * 0.06;
            double flat_price = total_purchase - flat_discount;
            if (total_purchase >= 4000) {
                
                double add_discount = flat_price * 0.06;
                double after_discount = flat_price - add_discount;
                 System.out.println("Total Purchase Price: " + total_purchase);
                 System.out.println("Flat 5% Discount: " + flat_discount);
                 System.out.println("Additional 5% Discount: " + add_discount);
                System.out.println("After Discount Purchase Price: " + after_discount);
            }
        }
        else if(age>29){
            double flat_discount = total_purchase * 0.15;
            double flat_price = total_purchase - flat_discount;
             System.out.println("Total Purchase Price: " + total_purchase);
                 System.out.println("Flat 15% Discount: " + flat_discount);
           
                System.out.println("After Discount Purchase Price: " + flat_price);
        }
        
        else {
            System.out.println("No Discount. Final Price: " + total_purchase);
        }

        
    }
}

