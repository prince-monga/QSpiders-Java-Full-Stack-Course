import java.util.Scanner;

class Ecom{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Age:");
	int age=sc.nextInt();
	System.out.println("Enter Purchased Price:");
	int purchasedPrice=sc.nextInt();
	double total_price_after_discount=purchasedPrice;

	if(age>=13 && age<=19){
		total_price_after_discount=purchasedPrice-purchasedPrice*0.05;
		if(total_price_after_discount>5000){	
			total_price_after_discount=total_price_after_discount-total_price_after_discount*0.05;
		}
	}
	
	else if(age>19 && age<=29){
		total_price_after_discount=purchasedPrice-purchasedPrice*0.06;
		if(total_price_after_discount>4000){	
			total_price_after_discount=total_price_after_discount-total_price_after_discount*0.06;
	
		}
	}  
	else if(age>29) {
		total_price_after_discount=purchasedPrice-purchasedPrice*0.15;
	}

	else{
		System.out.println("Not Eligible to Purchase.");
	}
	
	double discount=purchasedPrice-total_price_after_discount;
	System.out.println("Purchased price:"+purchasedPrice);
	System.out.println("Discount:"+discount);
	
	System.out.println("Total price after discount:"+total_price_after_discount);

}
}