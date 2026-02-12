package Day2;

import java.util.Scanner;

public class YoungestSibling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age & name of first sibling: ");
        int age1 = sc.nextInt();
        String name1 = sc.next();
        System.out.print("Enter the age & nameof second sibling: ");
        int age2 = sc.nextInt();
        String name2 = sc.next();
        System.out.print("Enter the age & name of third sibling: ");
        int age3 = sc.nextInt();
        String name3 = sc.next();

        if (age1 < age2 && age1 < age3) {
            System.out.println(name1 + " is the youngest sibling.");
        } else if (age2 < age1 && age2 < age3) {
            System.out.println(name2 + " is the youngest sibling.");
        } else {
            System.out.println(name3 + " is the youngest sibling.");
        }
        sc.close();
    }
}
