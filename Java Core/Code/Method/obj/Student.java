class Student
{
int roll;
String name;
String school_name;
long contact;
float percentage;

public void PrintDetails()
{
System.out.println("Details");
System.out.println(roll);
System.out.println(name);
System.out.println(school_name);
System.out.println(contact);
System.out.println(percentage);
}

public static void main(String[] args){

Student s=new Student();
Student t=new Student();
Student u=new Student();
Student d=new Student();
Student e=new Student();
System.out.println(s);
System.out.println(t);
System.out.println(u);
System.out.println(d);
System.out.println(e);

new Student(); //ref


System.out.println(new Student());
s.PrintDetails();
}
}