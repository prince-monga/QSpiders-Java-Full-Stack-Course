import java.util.Scanner;
class CharIsA {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character:");
		char ch = sc.next().charAt(0);

		if (ch == 'A') {
			System.out.println("character is capital A.");

		}
		if (ch != 'A') {
			System.out.println("character is not capital A.");

		}
	}
}