// This program demonstrates how to swap two numbers using a temporary variable.
package Day1;

class Swap1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using a temporary variable
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
