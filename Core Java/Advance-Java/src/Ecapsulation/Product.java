package Ecapsulation;

public class Product {

    private int productId;
    private String name;
    private String category;
    private double price;
    private int quantity;

    // Getters
    public int getProductId() { 
    	return productId; 
    	}
    public String getName() { 
    	return name; 
    	}
    public String getCategory() {
    	return category; 
    	}
    public double getPrice() {
    	return price; }
    public int getQuantity() {
    	return quantity; 
    }

    // Setters
    public void setProductId(int productId) {
    	this.productId = productId; 
    	}
    public void setName(String name) {
    	this.name = name;
    }
    public void setCategory(String category) { 
    	this.category = category;
    	}
    public void setPrice(double price) {
    	this.price = price;
    	}
    public void setQuantity(int quantity) {
    	this.quantity = quantity; }

    // hashCode
    @Override
    public int hashCode() {
        return productId;
    }

    // equals
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;

        Product p = (Product) obj;

        return this.productId == p.productId &&
               this.price == p.price &&
               this.quantity == p.quantity &&
               this.name.equals(p.name) &&
               this.category.equals(p.category);
    }

    // toString
    @Override
    public String toString() {
        return "Product {" +
                "ProductId=" + productId +
                ", Name='" + name + '\'' +
                ", Category='" + category + '\'' +
                ", Price=" + price +
                ", Quantity=" + quantity +
                '}';
    }
}
