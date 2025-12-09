class Pro5 {
    final private char getGrade(int marks) {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else return 'C';
    }
    public static void main(String[] args) {
        Pro5 obj = new Pro5();
        System.out.println("Grade: " + obj.getGrade(85));
    }
}