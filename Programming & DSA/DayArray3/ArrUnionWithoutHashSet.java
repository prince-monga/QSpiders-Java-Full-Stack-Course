package DayArray3;

import java.util.ArrayList;

public class ArrUnionWithoutHashSet {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        int[] arr2 = { 5, 6, 7, 8 };

        ArrayList<Integer> arrlist = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            if (!arrlist.contains(arr1[i])) {
                arrlist.add(arr1[i]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (!arrlist.contains(arr2[i])) {
                arrlist.add(arr2[i]);
            }
        }
        System.out.print(arrlist);
    }
}
