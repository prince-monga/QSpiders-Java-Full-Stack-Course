package StringPractice;

public class WordReverse {
    public static void main(String[] args) {
        String s = "hello i love java";
        String[] arr = s.split(" ");
        String rev = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            rev = rev + arr[i] + " ";
        }
        System.out.println(rev);
    }
}
