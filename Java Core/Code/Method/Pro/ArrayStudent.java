class ArrayStudent{
	void static public  main(String[] pri){
	ArrayStudent a=new ArrayStudent();
	ArrayStudent b=new ArrayStudent();
	ArrayStudent c=new ArrayStudent();

	ArrayStudent[] x={a,b,c};

	System.out.println(x);
	
	System.out.println(x.length);
	System.out.println(x[1]);
	System.out.println(x[0]);
	x[1]=new ArrayStudent();
	System.out.println(x[1]);
	

	}

}