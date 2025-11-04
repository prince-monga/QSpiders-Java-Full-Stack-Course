class CharIsLowerCaseVowel {
	public static void main(String[] args) {
		char ch = 'E';
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Vowel is Lower case.");
		}
		if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
			System.out.println("Vowel is not Lower case.");
		}
	}

}