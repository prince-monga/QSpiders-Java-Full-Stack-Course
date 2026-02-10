package Day1;

public class GreatestOfThreeNumber {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        // ~ 1st way
        // if (a > b) {
        // if (a > c) {
        // System.out.println("a is greater");
        // } else {
        // System.out.println("c is greater");
        // }
        // } else {
        // if (b > c) {
        // System.out.println("b is greater");
        // } else {
        // System.out.println("c is greater");
        // }
        // }

        // ?2nd way
        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > a && b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater");
        }
    }

}
