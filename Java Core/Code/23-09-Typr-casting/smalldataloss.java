public class smalldataloss {
    public static void main(String[] args) {
        int a = 130;
        byte b = (byte) a; // explicit casting
        System.out.println(b); // Output will be -126 due to overflow

    }
}
