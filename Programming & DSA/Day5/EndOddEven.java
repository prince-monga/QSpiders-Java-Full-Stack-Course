package Day5;

import java.util.Scanner;

public class EndOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int last = num % 10;

        if (last % 2 == 0)
            System.out.println("Ends with EVEN digit");
        else
            System.out.println("Ends with ODD digit");
        sc.close();
    }

}
