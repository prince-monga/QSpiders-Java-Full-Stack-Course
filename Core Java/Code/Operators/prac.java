public class prac {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        // System.out.println((++x) + (--x) + (++x) + (--y) + (++x) + (++y) + (++y));
        System.out.println((x++) + (x--) + (x++) + (y--) + (x++) + (y++) + (y++));
    }
}
