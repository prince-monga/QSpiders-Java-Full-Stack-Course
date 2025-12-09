class Pro6 {
    int x;
    Pro6(int x) {
        this.x = x;
    }
    void display() {
        System.out.println("Value: " + this.x);
    }
    public static void main(String[] args) {
        new Pro6(10).display();
    }
}