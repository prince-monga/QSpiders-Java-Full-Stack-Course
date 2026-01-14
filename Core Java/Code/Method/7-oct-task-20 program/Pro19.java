class Pro19 {
    protected double avg(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }
    public static void main(String[] args) {
        Pro19 obj = new Pro19();
        System.out.println("Average = " + obj.avg(5, 10, 15));
    }
}