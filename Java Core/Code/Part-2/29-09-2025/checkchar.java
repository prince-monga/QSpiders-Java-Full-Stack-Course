//Write a program to check given upper case,lower case, digit, special character

import java.util.Scanner;
class checkchar{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a charcter:");
	char ch=sc.next().charAt(0);
	
	if(ch>='A' && ch<='Z'){
		System.out.println(ch+" is upper case character.");
	}
	else if(ch>='a' && ch<='z'){
		System.out.println(ch+" is lower case character.");
	}
	else if(ch>='0' && ch<='9'){
		System.out.println(ch+" is Digit.");
	}
	else {
		System.out.println(ch+" is Special character.");
	}
	
	}
}