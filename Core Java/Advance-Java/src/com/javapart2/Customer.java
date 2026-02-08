package com.javapart2;

public class Customer {

	public static void main(String[] args) {
		

	}

}


class Product1{
	String product_name;
	int product_price;
	ProductPackaging pack;
	
	Product1(String product_name,int product_price,ProductPackaging pack){
		this.product_name=product_name;
		this.product_price=product_price;
	}
	
	   
}

class ProductPackaging{
	int p_price;
	float box_size;
}

//has a relationship --
//customer select product and customer class constructor call this 


-