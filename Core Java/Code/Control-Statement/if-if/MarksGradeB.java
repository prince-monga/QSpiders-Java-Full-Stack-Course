import java.util.Scanner;
class MarksGradeB {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks:");
		

		int marks = sc.nextInt();
		int marks = 86;
		if (marks >= 70 && marks <= 80) {
			System.out.println("B Grade");
		}
		if (marks < 70 || marks > 80) {
			System.out.println("Not B Grade");
		}
	}
}