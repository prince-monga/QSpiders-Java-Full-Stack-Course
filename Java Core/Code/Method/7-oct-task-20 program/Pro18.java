class Pro18 {
    static private boolean checkEligibility(int age) {
        return age >= 18;
    }
    public static void main(String[] args) {
        System.out.println("Eligible: " + checkEligibility(20));
    }
}