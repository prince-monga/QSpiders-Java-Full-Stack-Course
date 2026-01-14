import java.util.Scanner;
class checknum{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Number:");
	int num=sc.nextInt();

	if(num==0)
	{
	System.out.println(num+" "+"Number is Zero.");
	}
	else if(num>0)
	{
	System.out.println(num+" "+"Number is postive.");
	}
	else
	{
	System.out.println(num+" "+"Number is negative.");
	}
	
	}
}