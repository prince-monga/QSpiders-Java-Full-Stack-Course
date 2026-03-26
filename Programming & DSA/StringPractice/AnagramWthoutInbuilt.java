package StringPractice;

public class AnagramWthoutInbuilt {
    public static String sorts(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - 1 - i; j++) {
                if (c[j] > c[j + 1]) {
                    char temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }

        }
        return new String(c);
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        String s3 = sorts(s1);
        String s4 = sorts(s2);
        if (s3.equals(s4)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }
}
