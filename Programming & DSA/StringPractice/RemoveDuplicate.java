package StringPractice;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String s = "hello world";

        int[] h = new int[255];
        for (int i = 0; i < s.length(); i++) {
            h[s.charAt(i)]++;
        }
        String result = "";
        for (int i = 0; i < h.length; i++) {
            if (h[i] > 0) {
                result += (char) i;
            }

        }
        System.out.println(result);
    }
}
