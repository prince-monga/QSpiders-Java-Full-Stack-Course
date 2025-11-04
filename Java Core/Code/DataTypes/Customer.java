class Customer {
    public static void main(String[] args) {
        // Customer variables Declaration & Initialization
        int customer_id = 101, customer_pincode = 182204;
        String customer_name = "Prince", customer_city = "Kistwar", customer_state = "Jammu & Kashmir",
               customer_email = "contact@princemonga.site";
        long customer_phone = 9876543210L;
        byte customer_age = 21;
        char customer_membership = 'B'; // B = Basic, P = Premium
        float customer_wallet_balance = 1500.75f;
        double customer_total_purchase = 25000.50;
        boolean is_regular_customer = true;

        // Access variables
        System.out.println(
            "Customer ID: " + customer_id + "\n" +
            "Name: " + customer_name + "\n" +
            "Age: " + customer_age + "\n" +
            "City: " + customer_city + "\n" +
            "State: " + customer_state + "\n" +
            "Pincode: " + customer_pincode + "\n" +
            "Phone: " + customer_phone + "\n" +
            "Email: " + customer_email + "\n" +
            "Membership: " + customer_membership + "\n" +
            "Wallet Balance: " + customer_wallet_balance + "\n" +
            "Total Purchase: " + customer_total_purchase + "\n" +
            "Regular Customer: " + is_regular_customer
        );
    }
}
