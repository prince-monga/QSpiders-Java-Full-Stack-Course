package Collection;
import  java.util.LinkedList;



class ProductList{
	public static void main(String[] args) {
		Product p1=new Product(1200,1,"WaterBottle");
		Product p2=new Product(1400,4,"Shampoo");
		Product p3=new Product(5000,1,"Mobile");
		LinkedList<Product> lst= new LinkedList<Product>();
		lst.add(p1);
		lst.add(p2);
		lst.add(p3);
		System.out.println("Qty"+" "+"Type"+" "+"Price \n");
		for(Product p:lst) {
			System.out.println(p.qty+" "+p.type+" "+p.price);
		}

	}
}

