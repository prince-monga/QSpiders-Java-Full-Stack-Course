
public class simpleinterest {
    public static void main(String[] args) {
        int principal = 800000; // Principal amount
        int rate = 12; // Rate of interest
        int time = 5; // Time in years [60 months = 5 years]

        // Simple Interest formula: SI = (P * R * T) / 100
        int simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest is: " + simpleInterest);
    }

}
