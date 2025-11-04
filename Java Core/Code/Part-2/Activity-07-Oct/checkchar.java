import java.util.Scanner;
	
class checkchar{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Character:");
		char ch=sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){	
			System.out.println("The charcter is Alphabet.");
		}
		else if(ch>='1' && ch<='9'){
			System.out.println("The charcter is Number.");
		}
		else{
			System.out.println("A special Charcter.");
	
		}
	
	}
}