class customer
{
	static int shop_id;
	static String shop_name = "VidiPixels Store";
	int customer_id;
	String product = "Laptop";

	public static void shopDetails()
	{
		System.out.println(shop_id);
		System.out.println(shop_name);
	}
	public void customerDetails()
	{
		System.out.println(customer_id);
		System.out.println(product);
	}

	public static void main(String[] args)
	{
		System.out.println(new customer().product);
        System.out.println(new customer().shop_name);

		new customer().customerDetails();

		customer c = new customer();
		System.out.println(c.customer_id);
		System.out.println(c.shop_name);
		System.out.println(shop_name);
		

		shopDetails();
		c.customerDetails();

		new customer();
		new customer();
		new customer();
		new customer();
		new customer();
		
		System.out.println(new customer());
		System.out.println(new customer());
		System.out.println(new customer());
		System.out.println(new customer());
		System.out.println(new customer());	

		customer c1 = new customer();
		customer c2 = new customer();
		customer c3 = new customer();
		customer c4 = new customer();
		customer c5 = new customer();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
	}
}
