import java.util.Scanner;
class greaternum{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter 1st  Number:");
	int num1=sc.nextInt();
	System.out.println("Enter 2nd  Number:");
	int num2=sc.nextInt();
	System.out.println("Enter 3rd  Number:");
	int num3=sc.nextInt();
	System.out.println("Enter 4th Number:");
	int num4=sc.nextInt();

	if(num1>num2 && num1>num3 && num1>num4)
	{
		
		System.out.println( "1st:"+num1+ " is greater Number.");
	}

	else if(num2>num3 && num2>num4)
	{
		System.out.println("2nd:"+ num2+ " is greater Number.");
	}

	else if(  num3>num4)
	{
		System.out.println("3rd"+ num3+ " is greater Number.");
	}
	else
	{
		System.out.println( "4th:"+ num4+ " is greater Number.");

	}

	}
}