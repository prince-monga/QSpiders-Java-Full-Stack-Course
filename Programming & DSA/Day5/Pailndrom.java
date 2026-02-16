package Day5;

public class Pailndrom {
    public static void main(String[] args) {
        int num = 1001;
        int numcp = num;

        int revnum = 0;
        while (num > 0) {
            revnum = (revnum * 10) + (num % 10);
            num = num / 10;
        }

        if (revnum == numcp) {
            System.out.println("It palindrom number");
        } else {
            System.out.println("It is not a palindrom number.");
        }
    }
}
