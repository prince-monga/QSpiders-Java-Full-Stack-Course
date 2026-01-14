class UseRTvoid{
	// 5 Static void method
	public static void method1(){
		System.out.println("It is 1st static method.");
		return;
	}
	private static void method2(){
		System.out.println("It is 2nd static method.");
		
	}
	protected static void method3(){
		System.out.println("It is 3rd static method.");
		return;
	}
	static void method4(){
		System.out.println("It is 4th static method.");
		return;
	}
	static void method5(){
		System.out.println("It is 1st static method.");
		return;
	}

	// create 5 Non Static  void method
	public  void method6(){
		System.out.println("It is 6th Non static method.");
		return;
	}
	private void method7(){
		System.out.println("It is 7th Non static method.");
		
	}
	protected void method8(){
		System.out.println("It is 8th Non static method.");
		return;
	}
	void method9(){
		System.out.println("It is 9th Non static method.");
		return;
	}
	void method10(){
		System.out.println("It is 10th Non static method.");
	}


	public static void main(String[] args){
		System.out.print("Run succefully!");
		//Call directly Void method 
			method1();
			method2();
			method3();
			method4();
			method5();

		

		//----1---Methods with void return type do not return any value.

		//----2----So you cannot assign their result to a variable.

		//Store in a varible
		//UseRTvoid v1=method1(); ---unexpected type — required: value, found: void
		//System.out.print(v1);

		//Call Non static method using object refernce
		UseRTvoid u=new UseRTvoid();
			u.method6();
			u.method7();
			u.method8();
			u.method9();
			u.method10();
		
	}

}