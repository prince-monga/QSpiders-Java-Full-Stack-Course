import java.util.Scanner;
class CheckMarks{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter num:");
	int num=sc.nextInt();

	if(num>=40)
	{
	System.out.println("Pass :)");
	}
	
	else
	{
	System.out.println("fail :(");
	}
	
	}
}