class Program20 {
    
    public static int[] Method1() {
        int[] a = {1, 2, 3};
        System.out.println(a[0]);
                return a;
    }

    protected static String[] Method2() {
        String[] s = {"A", "B", "C"};
        System.out.println(s[1]);
                return s;
    }

    private static double[] Method3() {
        double[] d = {1.1, 2.2, 3.3};
        System.out.println(d[2]);
       
        return d;
    }

    static char[] Method4() {
        char[] c = {'A', 'B', 'C'};
        System.out.println(c[0]);
        
        return c;
    }

    public long[] Method5() {
        long[] l = {10, 20, 30};
        System.out.println(l[1]);
               return l;
    }

    protected boolean[] Method6() {
        boolean[] b = {true, false, true};
        System.out.println(b[2]);
                return b;
    }

    private byte[] Method7() {
        byte[] by = {1, 2, 3};
        System.out.println(by[1]);
      
        return by;
    }

    int[] Method8() {
        int[] n = {9, 8, 7};
        System.out.println(n[0]);
               return n;
    }

    public String[] Method9() {
        String[] city = {"Delhi", "Mumbai"};
        System.out.println(city[0]);
        
        return city;
    }

    static float[] Method10() {
        float[] f = {1.2f, 2.3f};
        System.out.println(f[1]);
       
        return f;
    }

    protected int Method11() {
        int[] x = {10, 20, 30};
        System.out.println(x[2]);
               return x[1];
    }

    private String Method12() {
        String[] s = {"A", "B"};
        System.out.println(s[0]);
        
        return s[1];
    }

    public double Method13() {
        double[] d = {10.1, 20.2, 30.3};
        System.out.println(d[0]);
               return d[1];
    }

    protected char Method14() {
        char[] c = {'P', 'Q'};
        System.out.println(c[1]);
                return c[0];
    }

    private long Method15() {
        long[] l = {111, 222};
        System.out.println(l[0]);
                return l[1];
    }

    boolean Method16() {
        boolean[] b = {true, false};
        System.out.println(b[1]);
                return b[0];
    }

    public byte Method17() {
        byte[] by = {2, 4};
        System.out.println(by[0]);
                return by[1];
    }

    static short Method18() {
        short[] s = {5, 10, 15};
        System.out.println(s[2]);
              return s[0];
    }

    protected String Method19() {
        String[] s = {"Red", "Green"};
        System.out.println(s[1]);
      
        return s[0];
    }

    private int[] Method20() {
        int[] a = {1, 2, 3};
        System.out.println(a[2]);
        
        return a;
    }

    public static void main(String[] args) {
        Program20 p = new Program20();
        System.out.println(Method1());
        Method2();
        Method3();
        Method4();
	Method18();
	Method10();

        p.Method5();
        p.Method6();
        p.Method7();
        p.Method8();
        p.Method9();
        
        p.Method11();
        p.Method12();
        p.Method13();
        p.Method14();
        p.Method15();
        p.Method16();
        p.Method17();
       
        p.Method19();
        p.Method20();
    }
}
