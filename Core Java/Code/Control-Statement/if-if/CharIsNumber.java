class CharIsNumber {
	public static void main(String[] args) {
		char ch = '4';
		if (ch >= '0' && ch <= '9') {
			System.out.println("Char is digit.");
		}
		if (!(ch >= '0' && ch <= '9')) {
			System.out.println("Check Charcater!");
		}
	}

}