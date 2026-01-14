class RecursionMainCallitSelf{

	
	public static void method()
	{
		System.out.println("method call itself");
		method();
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		String[] s={"Prince","Sinesh","Karan"};
		main(s);
	}
