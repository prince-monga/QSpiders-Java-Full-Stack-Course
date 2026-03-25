package Practice.Array;

import java.util.LinkedHashSet;

public class ArrayUnique {
    public static void main(String[] args) {

        int arr[] = { 8, 3, 1, 2, 3, 4, 5, 1, 2, 3 };
        LinkedHashSet<Integer> h = new LinkedHashSet<>();
        for (int num : arr) {
            h.add(arr[num]);
        }
        System.out.println(h);

    }
}
