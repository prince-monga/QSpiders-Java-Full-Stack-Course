class employee
{
	static int company_id;
	static String company_name = "VidiPixels Tech";
	int emp_id;
	String role = "Java Developer";

	public static void companyDetails()
	{
		System.out.println(company_id);
		System.out.println(company_name);
	}
	public void employeeDetails()
	{
		System.out.println(emp_id);
		System.out.println(role);
	}

	public static void main(String[] args)
	{
		System.out.println(new employee().role);
		System.out.println(new employee().company_name);

		new employee().employeeDetails();

		employee e = new employee();
		System.out.println(e.emp_id);
		System.out.println(e.company_name);
		System.out.println(company_name);
		

		companyDetails();
		e.employeeDetails();

		new employee();
		new employee();
		new employee();
		new employee();
		new employee();
		
		System.out.println(new employee());
		System.out.println(new employee());
		System.out.println(new employee());
		System.out.println(new employee());
		System.out.println(new employee());	

		employee e1 = new employee();
		employee e2 = new employee();
		employee e3 = new employee();
		employee e4 = new employee();
		employee e5 = new employee();
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);


		//call another class  method & varible

		
		schoolDetails();
		new Student().studentDetails(); 
		//s.studentDetails();
	}
}
