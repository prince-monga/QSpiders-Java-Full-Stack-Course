class User
{

int user_id;
String name;
long contact;
String gender;

public void PrintDetails(){
System.out.println(user_id);
System.out.println(name);
System.out.println(contact);
System.out.println(gender);
}


public static void main(String[] args){               
User name=new User();
User id=new User();
User password=new User();
User Contact=new User();
User gender=new User();

System.out.println(name);
System.out.println(id);
System.out.println(password);
System.out.println(Contact);
System.out.println(gender);



name.PrintDetails();
System.out.println(name);

new User();

System.out.println(new User());

}
}