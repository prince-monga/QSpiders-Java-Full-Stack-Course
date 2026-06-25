package StringPractice.Assinment;

public class FindAlphaDigitSpecial {
    public static void main(String[] args) {
        int al = 0;
        int digit = 0;
        int sp = 0;
        String str = "hell@#1234";
        char[] s = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if ((s[i] >= 'a' && s[i] <= 'z') || (s[i] >= 'A' && s[i] <= 'Z')) {
                al++;
            } else if (s[i] >= '0' && s[i] <= '9') {
                digit++;
            } else {
                sp++;
            }
        }
        System.out.println("Alphabtes: " + al);
        System.out.println("Digit: " + digit);
        System.out.println("special char : " + sp);
    }
}
