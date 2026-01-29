class Student
{
	String name;
	int roll;
	Student()
		{
			System.out.println("No argument");
		}
	Student(String name)
	{
		this.name=name;
		System.out.println(name);
	}
	Student(int roll, String name)
	{
		this.roll=roll;
		this.name=name;
		System.out.println(roll+ " "+ name);
	}
	public static void main(String[] args)
	{
		new Student("Himanshu");
		new Student(22, "Hitesh");
	}
}