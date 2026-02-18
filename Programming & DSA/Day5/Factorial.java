package Day5;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;

        int fact = 1;

        while (num >= 1) {
            fact = fact * num;
            num--;
        }
        // for (int i = 1; i <= num; i++) {
        // fact = fact * i;
        // }
        System.out.println("Factorial  is " + fact);
    }
}
