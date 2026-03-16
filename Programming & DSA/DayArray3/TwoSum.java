package DayArray3;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 5, 1, 6 };
        int target = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
    }
}
