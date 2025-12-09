class MultiReturn
{
	public static boolean method(){
	int a=3;
	if(a%2==0){
	System.out.println("Even number-");
	return true;
	}
	else{
	System.out.println("Odd number");
	return false;
	}
	}

	public static void main(String[] args)
	{
	System.out.println(method());
	}
}