package Day4;

import java.util.Scanner;

public class ResturantMenu {
    public static void main(String[] args) {
        System.out.println("----Resturant Menu-----");
        System.out.println("1 -> Idlie");
        System.out.println("2 -> Dosa");
        System.out.println("3 -> Biriyani");
        System.out.println("4 -> Meals");
        System.out.println("5 -> Ice cream");

        Scanner sc = new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("Select item number:");
        int item = sc.nextInt();

        switch (item) {
            case 1:
                System.out.println("Idile");
                break;
            case 2:
                System.out.println("Dosa");
                break;
            case 3:
                System.out.println("Biriyani");
                break;
            case 4:
                System.out.println("Meals");
                break;
            case 5:
                System.out.println("Ice cream");
                break;
            default:
                break;
        }
        sc.close();
    }
}
