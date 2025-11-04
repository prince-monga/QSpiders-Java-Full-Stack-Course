class Product1 {

    // Default (no modifier)
    static int shop_id;                            // static without initialization
    static String shop_name = "SmartStore";        // static with initialization
    int product_id;                                // non-static without initialization
    String product_name = "Laptop";                // non-static with initialization

    // Public
    public static String shop_branch;              
    public static String shop_location = "Mumbai"; 
    public int quantity;                           
    public String category = "Electronics";        

    // Protected
    protected static int shop_code;                
    protected static String owner = "Mr. Sharma";  
    protected String supplier_name;                
    protected int price = 55000;                   

    // Private
    private static String registration_no;         
    private static String headOffice = "Pune HQ";  
    private String warranty;                       
    private float discount = 1200.75f;             


    // Static method
    public static void shopDetails() {
        System.out.println(shop_id);
        System.out.println(shop_name);
        System.out.println(shop_branch);
        System.out.println(shop_location);
    }

    // Non-static method
    public void productDetails() {
        String product_name = "Mobile";

        System.out.println(product_name); // local variable
        System.out.println("use this keyword--" + this.product_name);
        System.out.println(product_id);
        System.out.println(this.quantity);
        System.out.println(category);
    }

    // Protected method
    protected void productPrice() {
        int price = 45000;
        System.out.println(supplier_name);
        System.out.println(price);
        System.out.println("use this keyword:" + this.price);
        System.out.println("Warranty: 1 Year");
        System.out.println("Checked by: Mr. Raj");
    }

    // Private static method
    private static void contactDetails() {
        System.out.println("Contact Details");
    }

    // Private non-static method
    private void discountDetails() {
        System.out.println(discount);
    }


    // Main method
    public static void main(String[] args) {

        Product1 p = new Product1();

        // Access static members
        System.out.println(shop_id);
        System.out.println(shop_branch);
        System.out.println(shop_location);
        shopDetails();

        // Access non-static
        System.out.println(p.product_name);
        System.out.println(p.product_id);
        System.out.println(p.supplier_name);
        System.out.println(p.category);

        p.productDetails();
        p.productPrice();

        // Object creation
        Product1 p1 = new Product1();
        Product1 p2 = new Product1();
        Product1 p3 = new Product1();
        Product1 p4 = new Product1();
        Product1 p5 = new Product1();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        // call static method using class.methodname();
        System.out.println("--call static method using class.methodname();--");
        Product1.shopDetails();

        // Call AllDetails Method
        p1.AllDetails();
    }


    // Non-static method accessing static & non-static members
    public void AllDetails() {
        System.out.println("Non-static method which accessing static & non-static members:");

        // Default access
        System.out.println(shop_id);
        System.out.println(shop_name);

        // Public access
        System.out.println(shop_branch);
        System.out.println(shop_location);

        // Protected access
        System.out.println(owner);
        System.out.println(price);

        // Private access
        System.out.println(headOffice);
        System.out.println(discount);

        productDetails();
        shopDetails();
        contactDetails();
        Product1.shopDetails();
    }
}
