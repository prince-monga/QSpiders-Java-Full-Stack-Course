package Day11;

public class ArrayRightRotation {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int k = -2;

        k = k % arr.length;
        if (k < 0) {
            k = k + arr.length;
        }
        for (int x = 0; x < k; x++) {
            int temp = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}