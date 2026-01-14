class Product
{
int ID=342;
static  String color="Black";
static  String name="IPhone 16";
float Price=234.4f;
static String Company="HPkl";

public static void  m1(){
System.out.println("hiii");

}
public void  m2(){
System.out.println("Non static");

}
public static void main(String[] args)
{	
Product l=new Product();
System.out.println(l.ID);
System.out.println(name);
System.out.println(color);
System.out.println(l.Price);
System.out.println(Company);
m1();
l.m2();
}
}