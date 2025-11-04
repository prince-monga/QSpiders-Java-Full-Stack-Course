
class d1 {
    public static void main(String[] args) {
        int num1 = 2345;
        int d1 = 2, d2 = 3, d3 = 4, d4 = 5;
        System.err.println("number: " + num1);
        System.out.println("digit 1: " + d1);
        System.out.println("digit 2: " + d2);
        System.out.println("digit 3: " + d3);
        System.out.println("digit 4: " + d4);

        // 2. sum of all digits
        int sum = d1 + d2 + d3 + d4;
        System.out.println("sum of digits: " + sum);

        // 3. product of all digits
        int product = d1 * d2 * d3 * d4;
        System.out.println("product of digits: " + product);

        // 4. print the sum of all even digits of a number
        int evenSum = d1 + d3;
        System.out.println(evenSum);

        // 5. print the sum of all odd digits
        int oddSum = d2 + d4;
        System.out.println(oddSum);

        // 6. print the sum of prime digits
        int primeSum = d2 + d3;
        System.out.println(primeSum);

    }
}