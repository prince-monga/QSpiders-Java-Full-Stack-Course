
class Student{
        private int age;
    private String name;
    
    //getter method for age & Name
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    
    //Setter methof for age and name-- Update and validate
    public void setName(String name){
        this.name=name;
    }
     public void setAge(int age){
         this.age=age;
    }
}
public class Mains
{

    
	public static void main(String[] args) {
		System.out.println("----====Encapsulaion====-----");
		Student obj=new Student();
		obj.setAge(22);
		obj.setName("prince");
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		
		
	}
}
