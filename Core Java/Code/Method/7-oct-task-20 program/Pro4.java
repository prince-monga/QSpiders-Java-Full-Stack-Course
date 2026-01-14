class Pro4 {
    protected boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        Pro4 p = new Pro4();
        System.out.println("Is 6 even " + p.isEven(6));
    }
}