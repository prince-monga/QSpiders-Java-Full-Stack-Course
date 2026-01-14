
public class Marks {
    public static void main(String[] args) {
        int sci = 78, math = 99, eng = 88, sst = 89, hindi = 67;
        int total = sci + math + eng + sst + hindi;
        System.out.println("Total marks is: " + total);
        float per = (float) (sci + math + eng + sst + hindi) / 5;
        System.out.println("Percentage is: " + per);
    }
}
