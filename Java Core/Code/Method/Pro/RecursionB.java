class RecursionB{

	public static void method1()
	{
		System.out.println("Method1 Statement");
		method3();
	}
	public static void method2()
	{
		System.out.println("Method2 Statement");
		method3();
	}
	public static void method3()
	{
		System.out.println("Method Statement");
		method1();
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		method2();
	}
}