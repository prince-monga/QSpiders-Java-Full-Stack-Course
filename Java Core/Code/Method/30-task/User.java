class User
{
static int ID=12;

String name="Prince";

static String password="Ghz@234";

String address="Himachal";

public static void  m1(){
System.out.println("Static method...");

}
public void  m2(){
System.out.println("Non static...");

}
public static void main(String[] args)
{	
User k=new User();
System.out.println(ID);
System.out.println(k.name);
System.out.println(password);
System.out.println(k.address);
m1();
k.m2();
}
}