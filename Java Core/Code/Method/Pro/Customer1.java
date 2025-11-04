class Customer1 {

    // Default (no modifier)
    static int store_id;                              // static without initialization
    static String store_name = "MegaMart";            // static with initialization
    int customer_id;                                  // non-static without initialization
    String customer_name = "Prince";                  // non-static with initialization

    // Public
    public static String store_branch;                
    public static String store_location = "Delhi";    
    public int customer_age;                          
    public String membership_type = "Premium";        

    // Protected
    protected static int store_code;                  
    protected static String manager = "Mr. Sharma";   
    protected String purchase_item;                   
    protected int total_bill = 4500;                  

    // Private
    private static String store_board;                
    private static String headOffice = "Mumbai HQ";   
    private String address;                           
    private float discount = 499.75f;                 


    // Static method
    public static void storeDetails() {
        System.out.println(store_id);
        System.out.println(store_name);
        System.out.println(store_branch);
        System.out.println(store_location);
    }

    // Non-static method
    public void customerDetails() {
        String customer_name = "Riya";
        System.out.println(customer_name); // access local variable
        System.out.println("use this keyword--" + this.customer_name); // using this keyword for accessing Class variable
        System.out.println(customer_id);
        System.out.println(this.customer_age);
        System.out.println(membership_type);
    }

    // Protected method
    protected void purchaseDetails() {
        int total_bill = 3500;
        System.out.println(purchase_item);
        System.out.println(total_bill);
        System.out.println("use this keyword:" + this.total_bill); // using this keyword for accessing Class variable
        System.out.println("Payment Mode: Online");
        System.out.println("Cashier: Mr. Raj");
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

        Customer1 c = new Customer1();

        // Access static members
        System.out.println(store_id);
        System.out.println(store_branch);
        System.out.println(store_location);
        storeDetails();

        // Access non-static
        System.out.println(c.customer_name);
        System.out.println(c.customer_id);
        System.out.println(c.purchase_item);
        System.out.println(c.membership_type);

        c.customerDetails();
        c.purchaseDetails();

        // Object creation
        Customer1 c1 = new Customer1();
        Customer1 c2 = new Customer1();
        Customer1 c3 = new Customer1();
        Customer1 c4 = new Customer1();
        Customer1 c5 = new Customer1();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

        // call static method using class.methodname();
        System.out.println("--call static method using class.methodname();--");
        Customer1.storeDetails();

        // Call AllDetails Method
        c1.AllDetails();
    }


    // Non-static method accessing static & non-static members
    public void AllDetails() {
        System.out.println("Non-static method which accessing static & non-static members:");

        // Default access
        System.out.println(store_id);
        System.out.println(store_name);

        // Public access
        System.out.println(store_branch);
        System.out.println(store_location);

        // Protected access
        System.out.println(manager);
        System.out.println(total_bill);

        // Private access
        System.out.println(headOffice);
        System.out.println(discount);

        customerDetails();   // non-static method inside non-static
        storeDetails();      // static method inside non-static
        contactDetails();    // private static inside non-static
        Customer1.storeDetails(); // static method call inside non-static using class.methodname()
    }
}
