class Customer
{
static int ID=12;
String name="Prince";
String password="Ghz@234";
String address="Himachal";

public static void  m1(){
System.out.println("Static method...");

}
public void  m2(){
System.out.println("Non static...");

}
public static void main(String[] args)
{	
Customer k=new Customer();
System.out.println(ID);
System.out.println(k.name);
System.out.println(k.password);
System.out.println(k.address);
m1();
k.m2();
}
}