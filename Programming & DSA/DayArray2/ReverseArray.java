package DayArray2;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 203;

        k = k % arr.length;

        // Step 1--- Reverse the entire array
        reverse(arr, 0, arr.length - 1);

        // Step 2--- Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3---Reverse remaining elements
        reverse(arr, k, arr.length - 1);

        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}