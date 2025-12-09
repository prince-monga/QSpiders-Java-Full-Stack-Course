class Program20 {
    
    public static int[] Method1() {
        int[] a = {1, 2, 3};
        System.out.println(a[0]);
        a = new int[]{4, 5, 6};
        return a;
    }

    protected static String[] Method2() {
        String[] s = {"A", "B", "C"};
        System.out.println(s[1]);
        s = new String[]{"X", "Y", "Z"};
        return s;
    }

    private static double[] Method3() {
        double[] d = {1.1, 2.2, 3.3};
        System.out.println(d[2]);
        d = new double[]{4.4, 5.5, 6.6};
        return d;
    }

    static char[] Method4() {
        char[] c = {'A', 'B', 'C'};
        System.out.println(c[0]);
        c = new char[]{'X', 'Y', 'Z'};
        return c;
    }

    public long[] Method5() {
        long[] l = {10, 20, 30};
        System.out.println(l[1]);
        l = new long[]{100, 200, 300};
        return l;
    }

    protected boolean[] Method6() {
        boolean[] b = {true, false, true};
        System.out.println(b[2]);
        b = new boolean[]{false, true};
        return b;
    }

    private byte[] Method7() {
        byte[] by = {1, 2, 3};
        System.out.println(by[1]);
        by = new byte[]{9, 8, 7};
        return by;
    }

    int[] Method8() {
        int[] n = {9, 8, 7};
        System.out.println(n[0]);
        n = new int[]{1, 2, 3};
        return n;
    }

    public String[] Method9() {
        String[] city = {"Delhi", "Mumbai"};
        System.out.println(city[0]);
        city = new String[]{"Paris", "Tokyo"};
        return city;
    }

    static float[] Method10() {
        float[] f = {1.2f, 2.3f};
        System.out.println(f[1]);
        f = new float[]{3.4f, 4.5f};
        return f;
    }

    protected int Method11() {
        int[] x = {10, 20, 30};
        System.out.println(x[2]);
        x = new int[]{40, 50, 60};
        return x[1];
    }

    private String Method12() {
        String[] s = {"A", "B"};
        System.out.println(s[0]);
        s = new String[]{"X", "Y"};
        return s[1];
    }

    public double Method13() {
        double[] d = {10.1, 20.2, 30.3};
        System.out.println(d[0]);
        d = new double[]{40.4, 50.5};
        return d[1];
    }

    protected char Method14() {
        char[] c = {'P', 'Q'};
        System.out.println(c[1]);
        c = new char[]{'R', 'S'};
        return c[0];
    }

    private long Method15() {
        long[] l = {111, 222};
        System.out.println(l[0]);
        l = new long[]{333, 444};
        return l[1];
    }

    boolean Method16() {
        boolean[] b = {true, false};
        System.out.println(b[1]);
        b = new boolean[]{false, true};
        return b[0];
    }

    public byte Method17() {
        byte[] by = {2, 4};
        System.out.println(by[0]);
        by = new byte[]{7, 8};
        return by[1];
    }

    static short Method18() {
        short[] s = {5, 10, 15};
        System.out.println(s[2]);
        s = new short[]{20, 25};
        return s[0];
    }

    protected String Method19() {
        String[] s = {"Red", "Green"};
        System.out.println(s[1]);
        s = new String[]{"Blue", "Yellow"};
        return s[0];
    }

    private int[] Method20() {
        int[] a = {1, 2, 3};
        System.out.println(a[2]);
        a = new int[]{9, 8, 7};
        return a;
    }

    public static void main(String[] args) {
        Program20 obj = new Program20();
        Method1();
        Method2();
        Method3();
        Method4();
        obj.Method5();
        obj.Method6();
        obj.Method7();
        obj.Method8();
        obj.Method9();
        Method10();
        obj.Method11();
        obj.Method12();
        obj.Method13();
        obj.Method14();
        obj.Method15();
        obj.Method16();
        obj.Method17();
        Method18();
        obj.Method19();
        obj.Method20();
    }
}
