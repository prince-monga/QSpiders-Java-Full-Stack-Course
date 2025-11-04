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
			method1();
			method2();
			method3();
			method4();
			method5();
		UseRTvoid u=new UseRTvoid();
			u.method6();
			u.method7();
			u.method8();
			u.method9();
			u.method10();
		
	}

}