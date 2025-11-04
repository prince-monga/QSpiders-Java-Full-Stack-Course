class NumberIsFourDigit {
	public static void main(String[] args) {
		int num = 2356;
		if (num >= 1000 && num <= 9999) {
			System.out.println("It is 4 digit number.");
		} else {
			System.out.println("It is not 4 digit number.");

		}
	}
}