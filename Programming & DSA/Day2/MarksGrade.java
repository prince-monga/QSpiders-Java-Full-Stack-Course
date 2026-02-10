package Day2;

public class MarksGrade {
    public static void main(String[] args) {
        int num = 56;
        if (num >= 90 && num <= 100) {
            System.out.println("Grade A");
        } else if (num >= 80 && num < 90) {
            System.out.println("Grade B");
        } else if (num >= 70 && num < 80) {
            System.out.println("Grade C");
        } else if (num >= 60 && num < 70) {
            System.out.println("Grade D");
        } else if (num >= 50 && num < 60) {
            System.out.println("Grade E");
        } else if (num >= 0 && num < 50) {
            System.out.println("Grade F");
        } else {
            System.out.println("Invalid Marks");
        }
    }
}
