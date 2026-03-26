package StringPractice;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "act";
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        if (new String(c1).equals(new String(c2))) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }

    }
}
