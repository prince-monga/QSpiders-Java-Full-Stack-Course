class girl{
	static int a=2;
	int c=6;
	public void gagan()
	{
	final int b=5;
	System.out.println(b);
	//b=10; 
	System.out.println(b); //10
	
	}
	public static void main(String[] args)
	{
	System.out.println(a);
	//gagan();

	girl g=new girl();
	//g.gagan();
	System.out.println(g.c);
	System.out.println(new girl());

	}
}
