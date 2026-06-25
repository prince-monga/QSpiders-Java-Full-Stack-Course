package Date16Apr;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "ababcdabc";

        int maxlen = 0;
        for (int i = 0; i < s.length(); i++) {
            String temp = "";
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (temp.indexOf(ch) != -1) {
                    break;
                }
                temp += ch;

                maxlen = Math.max(maxlen, temp.length());
            }
        }
        System.out.print(maxlen);
    }
}
