package Day9;

public class PatternCharAAAAA {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 'A'; i <= 'E'; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }
}
