import java.util.Scanner;
class oddeven{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number:");
	int num=sc.nextInt();

	if(num%2==0)
	{
	System.out.println(num+" "+"Number is Even.");
	}
	else
	{
	System.out.println(num+" "+"Number is odd.");
	}
	
	
	}
}