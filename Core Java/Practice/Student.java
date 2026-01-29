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
		System.out.println(roll+ " "+ roll);
	}
}