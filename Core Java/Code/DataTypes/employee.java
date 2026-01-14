class employee {
    public static void main(String[] args) {
        // Employee Details (Declaration & Initialization)
        int emp_id = 101;
        String emp_name = "Prince", designation = "AI Enginner", department = "IT", location = "Jammu";
        byte age = 23;
        float salary = 35000.50f,bouns=4999.9f;
        long contact = 9518219823L;

        // Access Variables
        System.out.println(
            "Employee ID: " + emp_id + "\n" +
            "Employee Name: " + emp_name + "\n" +
            "Designation: " + designation + "\n" +
            "Department: " + department + "\n" +
            "Location: " + location + "\n" +
            "Age: " + age + "\n" +
            "Salary: " + salary + "\n" +
	   "Bouns:"+bouns+"\n"+
            "Contact: " + contact
        );
    }
}
