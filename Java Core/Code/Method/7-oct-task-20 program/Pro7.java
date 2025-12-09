class Pro7 {
    static void greet() {
        System.out.println("Hello from static greet()");
    }
    void callGreet() {
        greet(); 
        Pro7.greet(); 
        this.greet(); 
    }
    public static void main(String[] args) {
        new Pro7().callGreet();
    }
}