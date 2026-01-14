class In_dc {
    public static void main(String[] args) {
        // post increment
        int a = 10;
        System.out.println(a++); // first print then increment now value of a is 11
        a++;
        System.out.println(a);

        // pre increment
        int b = 10;
        ++b;
        System.out.println(b);
        // post decrement
        int c = 10;
        c--;

        System.out.println(c);
        // pre decrement
        int d = 10;
        --d;
        System.out.println(d);

    }
}