package Day6.Assignment;

class DivisorOfNumber {
    public static void main(String[] args) {
        int num = 6;
        System.out.println("The divisors of " + num + " are:");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

}