package Day7;

public class FindSeriesOfPrimeNumber {
    public static void main(String[] args) {
        int start = 10;
        int end = 40;
        for (int i = start; i <= end; i++) {
            int count = 0;

            int num = i;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.print(num + " ");
            }
        }
    }
}
