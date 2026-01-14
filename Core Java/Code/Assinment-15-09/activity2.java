public class activity2 {
    public static void main(String[] args) {
        // 1. --> find last digit 56
        int num = 56;
        int last_digit = num % 10;
        System.out.println("Last digit of " + num + " is: " + last_digit);

        // 2. --> find last digit 3456789
        int num2 = 3456789;
        int last_digit2 = num2 % 10;
        System.out.println("Last digit of " + num2 + " is: " + last_digit2);

        // 3. --> find last digit 998765
        int num3 = 998765;
        int last_digit3 = num3 % 10;
        System.out.println("Last digit of " + num3 + " is: " + last_digit3);
        // 4. --> find last digit 23451
        int num4 = 23451;
        int last_digit4 = num4 % 10;
        System.out.println("Last digit of " + num4 + " is: " + last_digit4);
        // 5. --> find first digit 23
        int number = 23;
        int first_digit = number / 10;
        System.out.println("First digit of " + number + " is: " + first_digit);
        // 6. --> find first digit 98
        int number2 = 98;
        int first_digit2 = number2 / 10;
        System.out.println("First digit of " + number2 + " is: " + first_digit2);
        // 7. --> find first digit 26
        int number3 = 26;

        int first_digit3 = number3 / 10;
        System.out.println("First digit of " + number3 + " is: " + first_digit3);
        // 8. --> find first digit 42
        int number4 = 42;
        int first_digit4 = number4 / 10;
        System.out.println("First digit of " + number4 + " is: " + first_digit4);

    }
}
