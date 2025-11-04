class user
{
	static int app_id;
	static String app_name = "VidiPixels App";
	int user_id;
	String plan = "Premium";

	public static void appDetails()
	{
		System.out.println(app_id);
		System.out.println(app_name);
	}
	public void userDetails()
	{
		System.out.println(user_id);
		System.out.println(plan);
	}

	public static void main(String[] args)
	{
		System.out.println(new user().plan);
		System.out.println(new user().app_name);

		new user().userDetails();

		user u = new user();
		System.out.println(u.user_id);
		System.out.println(u.app_name);
		System.out.println(app_name);
		
		appDetails();
		u.userDetails();

		new user();
		new user();
		new user();
		new user();
		new user();
		
		System.out.println(new user());
		System.out.println(new user());
		System.out.println(new user());
		System.out.println(new user());
		System.out.println(new user());	

		user u1 = new user();
		user u2 = new user();
		user u3 = new user();
		user u4 = new user();
		user u5 = new user();
		
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u4);
		System.out.println(u5);
	}
}
