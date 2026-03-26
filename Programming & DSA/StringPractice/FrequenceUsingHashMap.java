package StringPractice;

import java.util.HashMap;

public class FrequenceUsingHashMap {
    public static void main(String[] args) {
        String s = "hello world";
        HashMap<Character, Integer> h = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ' && h.containsKey(c)) {
                int x = h.get(c) + 1;
                h.put(c, x);

            } else {
                h.put(c, 1);
            }

        }
        System.out.println(h);
    }
}
