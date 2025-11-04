import java.util.Scanner;

class CheckDayInMonth{
	public static void main(String[] args){	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Month number for check Days:");
	int month=sc.nextInt();
	
	switch(month){
	case 1:
	case 3:
	case 5:
	case 7:
	case 10:
	case 12:
	{
		System.out.println(month+" Month =>"+"31 Days");
	}
	break;
	case 2:{
		System.out.println(month+" Month =>"+"28 Days");

	}
	break;
	case 4:
	case 6:
	case 9:
	case 11:
	{
		System.out.println(month+" Month =>"+"30 Days");
	}
	default:
	{
		System.out.println("Invalid month number.");

	}
	}
	}
}