//Ques 2: Swap values without using third varible (Use arithmetic operators)
package Day1;

public class Swap2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}