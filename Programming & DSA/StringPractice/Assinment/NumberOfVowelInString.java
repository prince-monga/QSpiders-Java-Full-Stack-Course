package StringPractice.Assinment;

//FIND NUMER OF VOWEL IN  sTRING
//--vowel 'a','e','i','o','u';
//--String-- "hello prince"---->vowels: e,o,i,e - 4
public class NumberOfVowelInString {
    public static void main(String[] args) {
        int count = 0;
        String str = "hello prince";
        char[] s = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }

}