import java.util.Scanner;
class CheckDay{
public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Month Number:");
	int month=sc.nextInt();
	switch(month){
		case 1,3,5,7,8,10,12:{
			System.out.println("31 Days");
		}
		break;
		case 2:{
			System.out.println("28 or 29 Days");
		}
		break;
		case 4,6,9,11:{
			System.out.println("30 Days");
		}
		break;

		default:{
		System.out.println("Invaild !");
	}
    }
}
}