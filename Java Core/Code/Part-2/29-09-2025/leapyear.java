import java.util.Scanner;
class leapyear{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Year:");
	int year=sc.nextInt();
	//leap Year ()

	if((year%4==0 && year%100!=0) || year%400==0)
	{
	System.out.println(year+" "+" is leap year.");
	}
	
	else
	{
	System.out.println(year+" "+" is not leap year.");
	}
	
	}
}