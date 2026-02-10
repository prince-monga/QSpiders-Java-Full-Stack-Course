package Day2.Assignment;

//! Write a program that takes three inputs from the user and checks how many of these inputs are even. Depending on the number of even inputs, the program should perform different operations:
//     1. If only one input is even, the program should print that even number.
//     2. If two inputs are even, the program should print the sum of the two even numbers.
//     3. If all three inputs are even, the program should print the product of all three numbers.
//     4. If no input is even, the program should print 0.
public class EvenInput {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;
        int num3 = 20;

        int evenCount = 0;
        int evenSum = 0;
        int evenProduct = 1;

        if (num1 % 2 == 0) {
            evenCount++;
            evenSum += num1;
            evenProduct *= num1;

        }
        if (num2 % 2 == 0) {
            evenCount++;
            evenSum += num2;
            evenProduct *= num2;
        }
        if (num3 % 2 == 0) {
            evenCount++;
            evenSum += num3;
            evenProduct *= num3;
        }
        if (evenCount == 1) {
            System.out.println("Only one number is even: " + evenSum);
        } else if (evenCount == 2) {
            System.out.println("Two numbers are even: " + evenSum);
        } else if (evenCount == 3) {
            System.out.println("All three numbers are even: " + evenProduct);
        } else {
            System.out.println("No numbers are even: 0");
        }
    }
}
