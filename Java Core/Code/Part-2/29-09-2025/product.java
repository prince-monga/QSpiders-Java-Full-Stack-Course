import java.util.Scanner;
class product{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Product Price:");
	float product_price=sc.nextFloat();

	if(product_price>=100)
	{
	System.out.println("Original Price:"+product_price);
	float dis=(product_price*10)/100;
	product_price-=dis;
	System.out.println("\n\10% discount:"+dis+"\nAfter Discount:"+product_price);
	}
	
	else
	{
	System.out.println("Not Discount allow");
	}
	
	}
}