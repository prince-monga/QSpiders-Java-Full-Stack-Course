package StringPractice;

import java.util.Arrays;

public class SortingStringCharInbuilt {
    public static void main(String[] args) {
        String s = "hello";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.println(new String(arr));

    }
}
