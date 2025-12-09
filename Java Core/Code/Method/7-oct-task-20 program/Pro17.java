class Pro17 {
    private String formatName(String name) {
        return name.toUpperCase();
    }
    public void show() {
        System.out.println("Formatted Name: " + formatName("Prince"));
    }
    public static void main(String[] args) {
        new Pro17().show();
    }
}