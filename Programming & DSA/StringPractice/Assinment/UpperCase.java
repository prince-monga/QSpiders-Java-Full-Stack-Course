package StringPractice.Assinment;

public class UpperCase {
    public static void main(String[] args) {
        String s = "HeLLlo World";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            res += ch;
        }
        System.out.println(res);
    }
}
