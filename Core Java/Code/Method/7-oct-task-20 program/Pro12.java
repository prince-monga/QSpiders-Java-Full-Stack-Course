class Pro12 {
    final public boolean isPositive(int n) {
        return n > 0;
    }
    public static void main(String[] args) {
        Pro12 obj = new Pro12();
        System.out.println("Number is positive? " + obj.isPositive(7));
    }
}