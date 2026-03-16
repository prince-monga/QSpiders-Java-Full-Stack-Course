package DayArray3;

import java.util.HashSet;

public class ArrUnion {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 3, 4, 5, 6, 7 };

        HashSet<Integer> uni = new HashSet<>();

        for (int i : arr1) {
            uni.add(i);
        }
        for (int i : arr2) {
            uni.add(i);
        }
        System.out.print(uni);

    }
}
