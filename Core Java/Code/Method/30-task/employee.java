class employee
{
String name="Prince";

static String password="sjr@878";

long contact=9686786l;

static String Address="Jammu";

static String company="NetBuilds tech";

public static void  m1(){
System.out.println("Static");

}
public void  m2(){
System.out.println("Non static");

}
public static void main(String[] args)
{	
employee J=new employee();
System.out.println(J.name);
System.out.println(password);
System.out.println(J.contact);
System.out.println(Address);
System.out.println(company);
m1();
J.m2();
}
}