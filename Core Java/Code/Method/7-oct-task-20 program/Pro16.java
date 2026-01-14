class Pro16 {
    static int counter = 0;
    static void increment() {
        counter++;
    }
    void show() {
        increment();
        System.out.println("Counter: " + counter);
    }
    public static void main(String[] args) {
        new Pro16().show();
    }
}