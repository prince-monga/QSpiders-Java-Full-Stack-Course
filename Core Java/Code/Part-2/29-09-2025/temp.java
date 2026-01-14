import java.util.Scanner;
class temp{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter temperature:");
	int temp=sc.nextInt();

	if(temp<0)
	{
	System.out.println("temperature is below freezing point");
	}
	else
	{
	System.out.println("temperature is not below freezing point");
	}
	
	
	}
}