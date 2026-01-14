class Employee1 {

    // Default 
    static int company_id;                             // static without initialization
    static String company_name = "TechVision Pvt Ltd"; // static with initialization
    int emp_id;                                        // non-static without initialization
    String emp_name = "Prince";                        // non-static with initialization

    // Public
    public static String company_branch;               
    public static String company_location = "Bangalore"; 
    public int emp_age;                                
    public String emp_department = "Development";      

    // Protected
    protected static int company_code;                 
    protected static String ceo = "Mr. Sharma";        
    protected String emp_position;                     
    protected int salary = 85000;                      

    // Private
    private static String company_board;               
    private static String headOffice = "Mumbai HQ";    
    private String emp_address;                        
    private float emp_bonus = 1599.45f;               


    // Static method
    public static void companyDetails() {
        System.out.println(company_id);
        System.out.println(company_name);
        System.out.println(company_branch);
        System.out.println(company_location);
    }

    // Non-static method
    public void employeeDetails() {
        String emp_name = "Riya";
        System.out.println(emp_name); // access local variable
        System.out.println("use this keyword--" + this.emp_name); // using this keyword for accessing Class variable
        System.out.println(emp_id);
        System.out.println(this.emp_age);
        System.out.println(emp_department);
    }

    // Protected method
    protected void employeeSalary() {
        int salary = 56000;
        System.out.println(emp_position);
        System.out.println(salary);
        System.out.println("use this keyword:" + this.salary); // using this keyword for accessing Class variable
        System.out.println("Grade: A");
        System.out.println("Manager: Mr. Raj");
    }

    // Private static method
    private static void contactDetails() {
        System.out.println("Contact Details");
    }

    // Private non-static method
    private void bonusDetails() {
        System.out.println(emp_bonus);
    }


    // Main method
    public static void main(String[] args) {

        Employee1 e = new Employee1();

        // Access static members
        System.out.println(company_id);
        System.out.println(company_branch);
        System.out.println(company_location);
        companyDetails();

        // Access non-static
        System.out.println(e.emp_name);
        System.out.println(e.emp_id);
        System.out.println(e.emp_position);
        System.out.println(e.emp_department);

        e.employeeDetails();
        e.employeeSalary();

        // Object creation
        Employee1 e1 = new Employee1();
        Employee1 e2 = new Employee1();
        Employee1 e3 = new Employee1();
        Employee1 e4 = new Employee1();
        Employee1 e5 = new Employee1();

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println(e5);

        // call static method using class.methodname();
        System.out.println("--call static method using class.methodname();--");
        Employee1.companyDetails();

        // Call AllDetails Method
        e1.AllDetails();
    }


    // Non-static method accessing static & non-static members
    public void AllDetails() {
        System.out.println("Non-static method which accessing static & non-static members:");

        // Default access
        System.out.println(company_id);
        System.out.println(company_name);

        // Public access
        System.out.println(company_branch);
        System.out.println(company_location);

        // Protected access
        System.out.println(ceo);
        System.out.println(salary);

        // Private access
        System.out.println(headOffice);
        System.out.println(emp_bonus);

        employeeDetails();   // non-static method inside non-static
        companyDetails();    // static method inside non-static
        contactDetails();    // private static inside non-static
        Employee1.companyDetails(); // static method call inside non-static using class.methodname()
    }
}
