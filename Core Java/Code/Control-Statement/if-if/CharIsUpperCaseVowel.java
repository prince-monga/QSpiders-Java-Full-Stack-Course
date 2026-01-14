class CharIsUpperCaseVowel {
	public static void main(String[] args) {
		char ch = 'E';
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println("Vowel is upper case.");
		} 
		if (!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
			System.out.println("Vowel is not upper case.");
		}
	}

}