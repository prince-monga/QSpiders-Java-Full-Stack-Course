class abc{

public void student(int age,String name)
{
final int a=5;
System.out.println(age+" : "+name);
System.out.println(a);
//a=10;
System.out.println(a);
}
public static void main(String[] args)
{
//new abc();
//System.out.println(new abc());
new abc().student(18,"Prince");
System.out.println("Hey, I'm Main!");

//new student(18,"Prince");
}
}