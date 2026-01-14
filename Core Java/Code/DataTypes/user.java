class user {
    public static void main(String[] args) {


// for variable we are using snake case convention 
// 
        // User Details Declaration & Initialization

        int user_id = 12345,user_pincode = 182204;
        String user_name = "Prince", user_state = "Jammu & Kashmir", user_city = "Kistwar",
               user_email = "Princemonga@gmail.com", user_password = "Jammu@Kistwar",
               user_gender = "Male", user_role = "Developer";
        long user_mobile_no = 9518219823L;
       	 byte user_age = 21;
        char user_rating = 'A';
        short user_bill = 499,  user_login_count = 164;
        boolean is_login = true, is_premium_subscription = false;

        // Print all details  
        System.out.println(
            "User ID: " + user_id + "\n" 
            +"Name: " + user_name + "\n" +
            "State: " + user_state + "\n" +
            "City: " + user_city + "\n" +
            "Email: " + user_email + "\n" +
            "Password: " + user_password + "\n" +
            "Gender: " + user_gender + "\n" +
            "Role: " + user_role + "\n" +
            "Mobile No: " + user_mobile_no + "\n" +
            "Age: " + user_age + "\n" +
            "Rating: " + user_rating + "\n" 
            +"Bill: " + user_bill + "\n" +
            "Pincode: " + user_pincode + "\n" +
            "Login Count: " + user_login_count + "\n" +
            "Logged In: " + is_login + "\n" +
            "Premium Subscription: " + is_premium_subscription);
        
    }
}
