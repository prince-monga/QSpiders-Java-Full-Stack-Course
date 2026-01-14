class asm {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // assignment operator
        a += 5; // a = a + 5
        System.out.println("Value of a after += 5: " + a);

        b -= 10; // b = b - 10
        System.out.println("Value of b after -= 10: " + b);

        a *= 2; // a = a * 2
        System.out.println("Value of a after *= 2: " + a);

        b /= 5; // b = b / 5
        System.out.println("Value of b after /= 5: " + b);

        a %= 3; // a = a % 3
        System.out.println("Value of a after %= 3: " + a);

    }
}