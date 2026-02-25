package Day8;

public class StrongNumber {
    public static void main(String[] args) {
        int num = 145;
        int num1 = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            System.out.print(digit + " ");
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;

            num = num / 10;
        }
        System.out.println("sum: " + sum);
        if (num1 == sum) {
            System.out.println("It is strong number.");
        } else {
            System.out.println("It not a strong n umber.");
        }

        // ! using for loop

    }
}
