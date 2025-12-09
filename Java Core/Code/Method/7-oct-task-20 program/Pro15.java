class Pro15 {
    void callMethod() {
        this.print();
    }
    private void print() {
        System.out.println("Method called using this keyword");
    }
    public static void main(String[] args) {
        new Pro15().callMethod();
    }
}