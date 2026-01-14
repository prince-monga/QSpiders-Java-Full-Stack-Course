class Pro11 {
    private double area(double r) {
        return Math.PI * r * r;
    }
    void displayArea() {
        System.out.println("Area: " + area(4));
    }
    public static void main(String[] args) {
        new Pro11().displayArea();
    }
}