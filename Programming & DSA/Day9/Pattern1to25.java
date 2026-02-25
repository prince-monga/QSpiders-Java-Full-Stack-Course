package Day9;

public class Pattern1to25 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(count++ + " ");

            }
            System.out.println();
        }
    }
}
