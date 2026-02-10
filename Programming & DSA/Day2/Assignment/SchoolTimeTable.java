package Day2.Assignment;

//~ A school follows a day wise time table for its students to play a specific  game
// TIME TABLE  
// Monday: Basket Ball 
// Tuesday: Tennis 
// Wednesday: Basket Ball
// Thursday: Cricket
// Friday: Tennis
// Saturday: Exercise 
// Sunday: Holiday 
// Design a simple application which can read the day of the week and suggest to the student which game he is supposed to play today by following the prescribed timetable designed by the school.

public class SchoolTimeTable {
    public static void main(String[] args) {
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Basket Ball");
                break;
            case "Tuesday":
                System.out.println("Tennis");
                break;
            case "Wednesday":
                System.out.println("Basket Ball");
                break;
            case "Thursday":
                System.out.println("Cricket");
                break;
            case "Friday":
                System.out.println("Tennis");
                break;
            case "Saturday":
                System.out.println("Exercise");
                break;
            case "Sunday":
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Invalid day");
        }

    }
}
