package Date16Apr;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int cureentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            cureentSum = Math.max(arr[i], arr[i] + cureentSum);
            maxSum = Math.max(cureentSum, maxSum);
        }
        System.out.println(maxSum);
    }
}
