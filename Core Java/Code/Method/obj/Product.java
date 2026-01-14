class Product
{

int product_id;
String product_name;
String product_details;
int Stock ;
float product_rating;

public void PrintDetails(){
System.out.println(product_id);
System.out.println(product_name);
System.out.println(product_details);
System.out.println(Stock);
System.out.println(product_rating);
}


public static void main(String[] args){

new Product();

Product id=new Product();
Product sku=new Product();
Product name=new Product();
Product details=new Product();
Product rating=new Product();



System.out.println(id);
System.out.println(sku);
System.out.println(name);
System.out.println(details);
System.out.println(rating);



id.PrintDetails();

System.out.println(new Product());

}
}