import java.util.Scanner;

class charConvert{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Character:");
	char ch=sc.next().charAt(0);
	if(ch>='A' && ch<='Z'){
		char chL=(char)(ch+32);
	System.out.println("Character is upper case"+"\nConvert upper into lower case:"+" "+chL);

	}
	else if(ch>='a' && ch<='z'){
		char chU=(char)(ch-32);
	System.out.println("Character is lower case"+"\nConvert lower to upper case:"+" "+chU);

	}
	else if(ch>='0' && ch<='9'){
		int num=ch-48;
		if(num%2==0){
		System.out.println("Char is Even Number:"+num);

		}
		else{
		System.out.println("Char is odd Number:"+ch );
		}

	}
	else{
		int av=ch;
		System.out.println("Character is special char"+"\nConvert into Ascii value:"+" "+av);
		
	}

	
	}
}