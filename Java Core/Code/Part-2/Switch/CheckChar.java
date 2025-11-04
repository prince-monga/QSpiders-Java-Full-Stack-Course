import java.util.Scanner;
class CheckChar{
public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Character:");
	int ch=sc.next().charAt(0);
	
	switch(ch){
		case 'a','e','i','o','u':{
			System.out.println("Character is vowel.");
		}
		break;
		case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z':{
			System.out.println("Character is consont.");

		}
		break;
		default:{
			System.out.println("Ivalid!");

		}	
		

	}



	}
}