import java.util.Scanner;
	
class calculate{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\n Option for perform any task: \n");
		System.out.println("1. Addition\n2. Subtraction\n3. multiplication\n4. Division\n ");


		System.out.println("\nEnter Option:");
		int op=sc.nextInt();
		
		System.out.println("\nEnter first num:");
		int num1=sc.nextInt();
		
		System.out.println("\nEnter Second num:");
		int num2=sc.nextInt();
		
		
		switch(op){
			case 1:{
				int sum=num1+num2;
				System.out.println("Addtion is:"+sum);
			}
			break;
			case 2:{
				int sub=num1-num2;
				System.out.println("Substraction is:"+sub);
			}
			break;
			case 3:{
				int mul=num1+num2;
				System.out.println("Multi is:"+mul);
			}
			break;
			case 4:{
				int div=num1+num2;
				System.out.println("Divison is:"+div);
			}
			break;
			default:{
				System.out.println("Invalid Input!");

			}

		}	
		
	}
}