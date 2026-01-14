import java.util.Scanner;
	
class CheckChar{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Character:");
	char ch=sc.next().charAt(0);
	if(ch>='A' && ch<='Z'){
	System.out.println("Character is upper case");
	}
	else if(ch>='a' && ch<='z'){
	System.out.println("Character is lower case");
	}
	else if(ch>='0' && ch<='9'){
	System.out.println("Character is Digit.");
	}
	else{
	System.out.println("Character is Special Character.");
	}
	}
}