package DayArray3;

import java.util.HashMap;

public class TwoSumUsingHash {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 3, 4, 11, 6, -3, -1, 7 };
        int target = 10;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int x = target - arr[i];
            if (map.containsKey(x)) {
                System.out.println("[" + map.get(x) + "," + i + "]");
            }
            map.put(arr[i], i);
        }

    }
}
