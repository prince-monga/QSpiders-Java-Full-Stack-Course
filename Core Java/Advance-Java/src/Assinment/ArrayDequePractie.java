package Assinment;
import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequePractie {
    public static void main(String[] args) {

        ArrayDeque<Integer> aq = new ArrayDeque<>();

        aq.add(23);
        aq.add(33);
        aq.add(56);
        aq.add(12);
        aq.add(23);

        // Iterator
        Iterator<Integer> i = aq.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        // Enhanced for loop
        for (int a : aq) {
            System.out.println(a);
        }
    }
}
 