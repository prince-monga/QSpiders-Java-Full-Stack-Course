import java.util.Scanner;

class CheckPrimeNumber{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Boolean isPrime=true;
	if(n<=1){
	isPrime=false;
	}	
	else{
	   for(int i=2;i<=n/2;i++){
		if(n%i==0){
			isPrime=false;
			break;
			
			}
		}
	}

if(isPrime){
	System.out.println(n+" is a prime number");
}
else{
	System.out.println(n+" is a prime number");
}

	}
}