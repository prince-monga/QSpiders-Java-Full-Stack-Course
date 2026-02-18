package Day7;

public class CountFactors {
    public static void main(String[] args) {
        int num = 12, count = 0;

        for (int i = 1; i <= num / 2; i++) { // ? optimize code-- its time complexcity is ( log n )
            if (num % i == 0) {
                count += 1;
                System.out.println("fact:" + i + "\n ");
            }
        }
        System.out.println("total factor:" + count);
    }
}
