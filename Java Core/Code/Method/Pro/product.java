class product
{
	static int store_id;
	static String store_name = "VidiPixels Store";
	int product_id;
	String category = "Electronics";

	public static void storeDetails()
	{
		System.out.println(store_id);
		System.out.println(store_name);
	}
	public void productDetails()
	{
		System.out.println(product_id);
		System.out.println(category);
	}

	public static void main(String[] args)
	{
		System.out.println(new product().category);
		System.out.println(new product().store_name);

		new product().productDetails();

		product p = new product();
		System.out.println(p.product_id);
		System.out.println(p.store_name);
		System.out.println(store_name);
		

		storeDetails();
		p.productDetails();

		new product();
		new product();
		new product();
		new product();
		new product();
		
		System.out.println(new product());
		System.out.println(new product());
		System.out.println(new product());
		System.out.println(new product());
		System.out.println(new product());	

		product p1 = new product();
		product p2 = new product();
		product p3 = new product();
		product p4 = new product();
		product p5 = new product();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
	}
}
