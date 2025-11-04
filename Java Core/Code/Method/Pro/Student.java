class Student
{
	public static int school_id;
        private static String school_name="Dev School";
	public int roll;
	protected String class_name="10th Class";

	public static void schoolDetails()
	{
		System.out.println(school_id);
		System.out.println(school_name);
	}
	public  void studentDetails()
	{
		System.out.println(class_name);
		System.out.println(roll);
	}
	protected  void studentMarks()
	{
		System.out.println("45");
	}

	public static void main(String[] args)
	{
		System.out.println(new Student().roll);
		System.out.println(new Student().class_name);

		new Student().studentDetails();

		Student s=new Student();
		System.out.println(s.roll);
		System.out.println(s.class_name);
		System.out.println(school_name);
		System.out.println(school_id);

		schoolDetails();
		s.studentDetails();

		new Student();
		new Student();
		new Student();
		new Student();
		new Student();
		
		System.out.println(new Student());
		System.out.println(new Student());
		System.out.println(new Student());
		System.out.println(new Student());
		System.out.println(new Student());	

		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		

	}
}