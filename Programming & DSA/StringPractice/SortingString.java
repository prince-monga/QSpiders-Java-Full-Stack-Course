package StringPractice;

public class SortingString {
    public static void main(String[] args) {
        String s = "zxywe";
        // sorting this---> ehllo --According to the charachter
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(new String(arr));
    }
}
