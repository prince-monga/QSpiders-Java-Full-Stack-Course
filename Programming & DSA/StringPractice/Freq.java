package StringPractice;

public class Freq {
    public static void main(String[] args) {

        String s = "hello world";

        int[] h = new int[255];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                h[s.charAt(i)]++;
            }
        }
        for (int i = 0; i < h.length; i++) {
            if (h[i] > 0) {
                System.out.println((char) i + " " + h[i]);
            }
        }
    }
}