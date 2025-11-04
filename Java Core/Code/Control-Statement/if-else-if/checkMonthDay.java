import java.util.Scanner;
class checkMonthDay{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Month Number (1-12) for check number of days:");
	int month=sc.nextInt();
	if(month==1 ||month==3||month==5 ||month==7 ||month==8 ||month==10 ||month==12){
		System.out.println(month+" month:"+"31 Days");
	}
	else if(month==2){
		System.out.println(month+" month:"+"28 Days");
	}
	else if(month==4 || month==6 || month==9 || month==11){
		System.out.println(month+" month:"+"30 Days");
	}
	else{
		System.out.println("Invalid month number");
	}
	
	}
}