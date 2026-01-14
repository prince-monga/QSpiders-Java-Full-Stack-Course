import java.util.Scanner;

class checkOddWithOutModuls{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number:");
	int num=sc.nextInt();
	if((num & 1)!=0){
	 System.out.println(num+" is odd number.");
	}
	if((num & 1)==0){
	 System.out.println(num+" is not odd number.");
	}
	}
}