class RecursionMainCallAnother{

	public static void method()
	{
		System.out.println("method call itself");
		String[] s={"Prince","Sinesh","Karan"};
		main(s);
	}
	public static void main(String[] ar)
	{
		System.out.println("Start");
		method();
	}
}