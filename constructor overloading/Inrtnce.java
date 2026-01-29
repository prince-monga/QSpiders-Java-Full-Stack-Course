class Inrtnce extends Inrtnc
{
String name;

public void m3(String name)
{
this.name=name;
System.out.println(name);
}

public static void main(String[] args)
{
Inrtnce j=new Inrtnce();
System.out.println(j.name);
System.out.println(j.roll);
j.m3("Him");
j.m1();
}
}