class CharIsUpperCase {
	public static void main(String[] args) {
		char ch = 'P';
		if (ch >= 'A' || ch <= 'Z') {
			System.out.println("character is upper case.");
		}
		if (!(ch >= 'A' || ch <= 'Z')) {
			System.out.println("character is not upper case.");
		}

	}

}