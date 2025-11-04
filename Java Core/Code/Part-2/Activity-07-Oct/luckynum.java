import java.util.Scanner;
	
class luckynum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int num=sc.nextInt();
		
		if(num%5==0){	
			System.out.println("Lucky Number :)-");
		}
		else{
			System.out.println("Sorry,try Again!");
		}
	
	}
}