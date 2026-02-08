package com.javapart2;

public class CP {

    public static void main(String[] args) {
        Product p1 = new Product("TV", 10000);
        Product p2 = new Product("LED", 34434);
        Product p3 = new Product("TV", 10000);

        Product[] p = new Product[3];
        p[0] = p1;
        p[1] = p2;
        p[2] = p3;

        Customer1 c = new Customer1("Prince", p);

        System.out.println(c);
        for(Product pr :c.product){
        	System.out.println(pr.name+" "+pr.price);  	
        }
    }
}

class Customer1 {
    String name;
    Product[] product; // HAS-A relationship

    public Customer1(String name, Product[] product) {
        this.name = name;
        this.product = product;
    }
}

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
