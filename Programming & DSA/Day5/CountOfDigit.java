package Day5;

public class CountOfDigit {
    public static void main(String[] args) {
        int count = 0;
        int num = 12345;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        System.out.println(count);
    }
}
