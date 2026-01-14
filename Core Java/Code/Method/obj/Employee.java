class Employee
{

int emp_id;
String name;
String role;
long contact;
float perfomance;

public void PrintDetails(){
System.out.println(emp_id);
System.out.println(name);
System.out.println(role);
System.out.println(contact);
System.out.println(perfomance);
}


public static void main(String[] args){

Employee em=new Employee();
Employee e=new Employee();
Employee m=new Employee();
Employee p=new Employee();
Employee l=new Employee();
System.out.println(em);
System.out.println(m);
System.out.println(p);
System.out.println(l);
System.out.println(e);



em.PrintDetails();
System.out.println(em);

new Employee();

System.out.println(new Employee());

}
}