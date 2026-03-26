package StringPractice;

class PrintUniqueArray {
    public static void main(String[] args) {

        String s = "hello world";

        int[] h = new int[255];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                h[s.charAt(i)]++;
            }
        }
        for (int i = 0; i < h.length; i++) {
            if (h[s.charAt(i)] == 1) {
                System.out.println(s.charAt(i));
                break;
            }

        }
    }
}
