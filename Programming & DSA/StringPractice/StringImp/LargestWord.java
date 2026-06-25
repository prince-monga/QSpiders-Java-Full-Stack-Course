package StringPractice.StringImp;

public class LargestWord {
    public static void main(String[] args) {
        String str = "I am Prince Arora";
        String[] arr = str.split(" ");

        String largest = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > largest.length()) {
                largest = arr[i];
            }
        }
        System.out.print(largest);
    }
}
