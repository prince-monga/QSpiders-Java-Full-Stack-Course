class A
{
int x;
int y;
static int t = 7;
static int r;

A()
{
	System.out.println("Constructor");
}
public static void m1()	// static method
{
	System.out.println("Hy");
}
public void m2()	//non static method
{
	System.out.println("Hello");
}
static		//Static multiple initializer
{
	System.out.println("Welcome");
}
static		//Static multiple initializer
{
	System.out.println("To Qspiders");
}
public void m3()	//non static method
{
	System.out.println("bye1");
}
{	//non static multiline initializer
	System.out.println("Thanks for using java");
}

public static void main(String[] args)
{
System.out.println("Start");

A a=new A();
A a1=new A();
}

{	//non static multiple initializer
	System.out.println("Thanks for joining Qspiders Gurugram");
}
static	//static multiline initializer
{
	System.out.println("Good Morning, Have a nice day");
}
}