public class activity {
    public static void main(String[] args) {
        int num = 12345;
        int first_digits = num / 10000;
        System.out.println("First digits of " + num + " is: " + first_digits);
        int last_digit = num % 10;
        System.out.println("Last digit of " + num + " is: " + last_digit);
    }
}
