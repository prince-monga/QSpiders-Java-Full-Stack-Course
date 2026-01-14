class student
{
String name="Prince";
static int student_id =878;
long contact=9686786l;
static String deg="MCA";
static String college="DU";

public static void  m1(){
System.out.println("hiii");

}
public static void  m2(){
System.out.println("Non static");

}
public static void main(String[] args)
{	
student s=new student();
System.out.println(s.name);
System.out.println(student_id);
System.out.println(s.contact);
System.out.println(deg);
System.out.println(college);

m1();
s.m2();
}
}