class Student1 {

    static int school_id;                        // static without initialization
    static String school_name = "DAV School";    // static with initialization
    int roll;                                    // non-static without initialization
    String name = "Prince";                      // non-static with initialization


    public static String school_branch;          
    public static String school_location = "Jammu"; 
    public int age;                              
    public String section = "A";               

    protected static int school_code;            
    protected static String principal = "Mr. Sharma"; 
    protected String class_name;                 
    protected int marks = 85;                    

    private static String board;                 
    private static String headOffice = "Delhi HQ"; 
    private String address;                      
    private float fees = 2599.45f;              


    public static void schoolDetails() {
        System.out.println(school_id);
        System.out.println(school_name);
        System.out.println(school_branch);
        System.out.println(school_location);
    }

    public void studentDetails() {
	String name="RIYA";
	System.out.println(name); //access local varible
        System.out.println("use this keyword--"+this.name);//using this keyword for accessing Class varible
        System.out.println(roll);
        System.out.println(this.age);
        System.out.println(section);
    }

    protected void studentMarks() {
	int marks=56;
        System.out.println(class_name);
	 System.out.println(marks);
        System.out.println("use this keyword:"+this.marks); //using this keyword for accessing Class varible
        System.out.println("Grade: A");
        System.out.println("Teacher: Mr. Raj");
    }

    private static void contactDetails() {
        System.out.println("Contact Details");
        
    }
   private  void feeDetails() {
                System.out.println(fees);
    }
	


    public static void main(String[] args) {

        Student1 s = new Student1();

        // Access static members
        System.out.println(school_id);
        System.out.println(school_branch);
        System.out.println(school_location);
        schoolDetails();

        // Access non-static
        System.out.println(s.name);
        System.out.println(s.roll);
        System.out.println(s.class_name);
        System.out.println(s.section);

        s.studentDetails();
        s.studentMarks();

        // Object creation
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        Student1 s3 = new Student1();
        Student1 s4 = new Student1();
        Student1 s5 = new Student1();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

	//call static method using class.methodname();
	System.out.println("--call static method using class.methodname();--");
	Student1.schoolDetails();
	
        // Call AllDetails Method 

        s1.AllDetails();
    }


    public void AllDetails() {
        System.out.println("Non-static method which accessing static & non-static members:");

        // Default access
        System.out.println(school_id);
        System.out.println(school_name);

        // Public access
        System.out.println(school_branch);
        System.out.println(school_location);

        // Protected access
        System.out.println(principal);
        System.out.println(marks);

        // Private access
        System.out.println(headOffice);
        System.out.println(fees);

        studentDetails();   // non-static method inside non-static
        schoolDetails();    // static method inside non-static
        contactDetails();   // private non-static inside non-static
	Student1.schoolDetails(); // static method call inside non static method using class.methodname()
    }
}
