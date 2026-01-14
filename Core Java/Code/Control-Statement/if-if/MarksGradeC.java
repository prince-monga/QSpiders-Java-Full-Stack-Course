import java.util.Scanner;
class MarksGradeC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks:");
		

		int marks = sc.nextInt();
		if (marks >= 60 && marks <= 70) {
			System.out.println("C Grade");
		}
		if (marks < 60 || marks > 70) {
			System.out.println("Not C Grade");
		}
	}
}