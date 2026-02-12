package Day4;

public class SportsDay {
    public static void main(String[] args) {
        String day = "Wednesday";
        switch (day) {
            case "Monday":
                System.out.println("Basketball");
                break;
            case "Tuesday":
                System.out.println("Tennis");
                break;
            case "Wednesday":
                System.out.println("Basketball");
                break;
            case "Thrusday":
                System.out.println("Cirket");
                break;
            case "Firday":
                System.out.println("Basketball");
                break;
            case "Saturday":
                System.out.println("Football");
                break;
            case "Sunday":
                System.out.println("tennis");
                break;
            default:
                System.out.println("Invaild day");
                break;
        }
    }
}
