import java.util.Scanner;

class checkDivBy6{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number:");
	int num=sc.nextInt();
	if(num%2==0 && num%3==0){
	 System.out.println(num+" is diviable by 6.");
	}
	if(num%2!=0 || num%3!=0){
	 System.out.println(num+" is not diviable by 6.");
	}
	}
}