class User1 {

    // Default (no modifier)
    static int app_id;                             // static without initialization
    static String app_name = "VidiConnect";        // static with initialization
    int user_id;                                   // non-static without initialization
    String username = "Prince";                    // non-static with initialization

    // Public
    public static String app_version;              
    public static String app_location = "India";   
    public int age;                                
    public String user_type = "Premium";           

    // Protected
    protected static int security_code;            
    protected static String admin = "Mr. Sharma";  
    protected String last_login;                   
    protected int points = 120;                    

    // Private
    private static String app_license;             
    private static String headOffice = "Delhi HQ"; 
    private String password;                       
    private float wallet_balance = 499.50f;        


    // Static method
    public static void appDetails() {
        System.out.println(app_id);
        System.out.println(app_name);
        System.out.println(app_version);
        System.out.println(app_location);
    }

    // Non-static method
    public void userDetails() {
        String username = "Riya";
        System.out.println(username); // local variable
        System.out.println("use this keyword--" + this.username); // access class variable
        System.out.println(user_id);
        System.out.println(this.age);
        System.out.println(user_type);
    }

    // Protected method
    protected void userPoints() {
        int points = 90;
        System.out.println(last_login);
        System.out.println(points);
        System.out.println("use this keyword:" + this.points);
        System.out.println("Membership: Active");
        System.out.println("Support Agent: Mr. Raj");
    }

    // Private static method
    private static void contactDetails() {
        System.out.println("Contact Details");
    }

    // Private non-static method
    private void walletDetails() {
        System.out.println(wallet_balance);
    }


    // Main method
    public static void main(String[] args) {

        User1 u = new User1();

        // Access static members
        System.out.println(app_id);
        System.out.println(app_version);
        System.out.println(app_location);
        appDetails();

        // Access non-static
        System.out.println(u.username);
        System.out.println(u.user_id);
        System.out.println(u.last_login);
        System.out.println(u.user_type);

        u.userDetails();
        u.userPoints();

        // Object creation
        User1 u1 = new User1();
        User1 u2 = new User1();
        User1 u3 = new User1();
        User1 u4 = new User1();
        User1 u5 = new User1();

        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
        System.out.println(u4);
        System.out.println(u5);

        // call static method using class.methodname();
        System.out.println("--call static method using class.methodname();--");
        User1.appDetails();

        // Call AllDetails Method
        u1.AllDetails();
    }


    // Non-static method accessing static & non-static members
    public void AllDetails() {
        System.out.println("Non-static method which accessing static & non-static members:");

        // Default access
        System.out.println(app_id);
        System.out.println(app_name);

        // Public access
        System.out.println(app_version);
        System.out.println(app_location);

        // Protected access
        System.out.println(admin);
        System.out.println(points);

        // Private access
        System.out.println(headOffice);
        System.out.println(wallet_balance);

        userDetails();
        appDetails();
        contactDetails();
        User1.appDetails();
    }
}
