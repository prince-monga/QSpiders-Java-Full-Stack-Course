import java.util.Scanner;

class CheckVowelConsonant{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Any Character:");
	char ch=sc.next().charAt(0);
	
	switch(ch){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		{
		System.out.println(ch+ " is a vowel");
		}
		break;
		case 'b':
		case 'c':
		case 'd':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
		{
		System.out.println(ch+" is a Consnant.");
		}
		break;
		default:{
		System.out.println("Invalid Char");
		}
	}
	}
}