class Pro9 {
    protected String message = "Learning Java";
    protected void printMsg() {
        System.out.println(this.message);
    }
    public static void main(String[] args) {
        new Pro9().printMsg();
    }
}