package DayArray2;

import java.util.ArrayList;
import java.util.List;

public class MergeArray {
    public static void main(String[] args) {
        int[] a = { 5, 4, 6 };
        int[] b = { 2, 3, 1, 8 };
        List<Integer> res = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                res.add(a[i]);
                i++;
            } else {
                res.add(b[j]);
                j++;
            }
        }
        while (i < a.length) {
            res.add(a[i]);
            i++;

        }
        while (j < b.length) {
            res.add(b[j]);
            j++;
        }
        System.out.println(res);
    }
}
