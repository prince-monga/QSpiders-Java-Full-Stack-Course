class prac1
{
int x;
static int y;

public static void m1(){
	System.out.println(y);

}

public  void m2(){
	System.out.println(x);

}



public void m3(){
	System.out.println(x);
	System.out.println(y);
	m1();
	m2();
}

public static void main(String[] args)
{

	System.out.println(y);
	
	prac1 p=new prac1();
	System.out.println(p.x);
	p.m3();
}

//non-static method create krna call non-static or 

}