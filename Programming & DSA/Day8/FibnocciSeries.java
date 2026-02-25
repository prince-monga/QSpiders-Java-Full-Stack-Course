package Day8;

public class FibnocciSeries {
    public static void main(String[] args) {

        // !Using While loop
        // int n1 = 0;
        // int n2 = 1;
        // int i = 1;
        // int k = 6;
        // while (i < 10) {
        // if (i == k) {
        // System.out.print(n1 + " ");
        // }
        // int n3 = n1 + n2;
        // n1 = n2;
        // n2 = n3;

        // i++;
        // }

        // ! Using For loop
        int n1 = 0;
        int n2 = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.println(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

    }
}
