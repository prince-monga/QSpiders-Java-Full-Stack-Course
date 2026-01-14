import java.util.Scanner;

class checkEvenWithOutModuls{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number:");
	int num=sc.nextInt();
	if((num & 1)==0){
	 System.out.println(num+" is even.");
	}
	else{
	 System.out.println(num+" is not even number.");
	}
	}
}