package Day9;

public class PtternCHARabcde {
    public static void main(String[] args) {
        for (int i = 'a'; i <= 'e'; i++) {
            for (int j = 'a'; j <= 'e'; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }
}
