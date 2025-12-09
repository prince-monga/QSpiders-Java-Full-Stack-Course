class UseRTnonPrimitive
{
	public static String method1()
	{
	//Static methods
	System.out.println("--Static method with String return type--");
	return "String Return Type";
	}
	
	private static String method2()
	{
	System.out.println("--Static method with Null Return Statement--");
	return null;
	}
	
	protected static UseRTnonPrimitive method3()
	{
	System.out.println("--Static method with Object refernce return type--");
	return new UseRTnonPrimitive();
	}

	//Non-Static Methods
	public  String method4()   //String Return type
	{
	System.out.println("--Non Static method with String return type--");
	String s="It is String RT";
	return s; //retuen value
	}
	
	private  String method5()
	{
	
	System.out.println("--Non Static method with Null Return Statement--");

	System.out.println("call method using this keyword:"+ this.method4());   //calling method using this keyword
	return null;
	}
	
	protected  UseRTnonPrimitive method6()
	{
	System.out.println("--Non Static method with object refer. return type--");
	UseRTnonPrimitive u=new UseRTnonPrimitive();
	return u;
	}

	
	public static void main(String[] args){
		//---1.-Print method statemnts and return value
		System.out.println(method1());
		System.out.println(method2());
		System.out.println(method3());
		//---2.-Calling method and store return value in a variable
		String s1=method1();
		String s2=method2();
		UseRTnonPrimitive u1=method3();
		//---3.-print only return value
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(u1);

		UseRTnonPrimitive r=new UseRTnonPrimitive();
		System.out.println(r.method4());
		System.out.println(r.method5());
		System.out.println(r.method6());
		
		String s11=r.method4();
		String s22=r.method5();
		UseRTnonPrimitive u11=r.method6();

		System.out.println(s11);
		System.out.println(s22);
		System.out.println(u11);
		
	}
	


	
}