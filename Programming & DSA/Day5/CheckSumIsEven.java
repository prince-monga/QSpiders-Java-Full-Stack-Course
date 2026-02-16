package Day5;

public class CheckSumIsEven {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }
        if (num % 2 == 0) {
            System.out.println(sum + " is even.");
        } else {
            System.out.println(sum + " is not even.");
        }
    }

}
