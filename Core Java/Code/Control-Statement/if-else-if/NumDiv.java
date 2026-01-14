import java.util.Scanner;

class NumDiv{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any number:");
		int num=sc.nextInt();
		if(num%2==0){
		int pow2=num*num;
		System.out.println("Number is divisible by 2.\n"+num+" "+"power 2:"+pow2);
		}
		if(num%3==0){
		int pow3=num*num*num;
		System.out.println("Number is divisible by 3.\n"+num+" "+"Cube:"+pow3);
		}
		if(num%4==0){
		int pow4=num*num*num*num;
		System.out.println("Number is divisible by 4.\n"+num+" "+"power 4:"+pow4);
		}
		else{
			System.out.println("Number is "+num);
		}
	}
}