class CharIsLowerCase {
	public static void main(String[] args) {
		char ch = 'a';
		if (ch >= 'a' || ch <= 'z') {
			System.out.println("character is lower case.");
		}
		if (!(ch >= 'a' || ch <= 'z')) {
			System.out.println("Character is not lower case.");
		}
	}

}