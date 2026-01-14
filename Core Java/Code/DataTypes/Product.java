class Product {
    public static void main(String[] args) {
        // product Details Declaration & Initialization
        
	String product_name="HP laptop", product_category="Electronics",product_model="hp 15s- fq45600",storage="1 TB";
	short total_product=100,product_stock=56,sales=16;
	long product_id=568947379l;
	float product_MRP=49999.99f, offer_price=45999.99f;
	int product_discount=4000;
	byte warrenty_years=2;
	char product_rating='A';
	boolean isBest=true;

	//Print all details (access)
	System.out.println(
		"Product Name:"+product_name+"\n"+
		"Product MRP:"+product_MRP+"\n"+
		"Offer Price:"+offer_price+"\n"+
		"Product Discount:"+product_discount+"\n"+
		"Product Category:"+product_category+"\n"+
		"Product Model:"+product_model+"\n"+
		"Storage:"+storage+"\n"+
		"Product Id:"+product_id+"\n"+
		"Warranty Years:"+warrenty_years+"\n"+
		"Product Rating:"+product_rating+"\n"+
		"Total Product:"+total_product+"\n"+
		"Product Stock:"+product_stock+"\n"+
		"Sales:"+sales+"\n"+
		"Best Product:"+isBest+"\n"
	);
	
	
    }
}
