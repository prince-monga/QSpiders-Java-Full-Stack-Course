package Date16Apr;

public class ProductArrayEceptSelf {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5 };
        int n = arr.length;
        int ans[] = new int[n];

        // left
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * arr[i - 1];
        }
        // Right
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right *= arr[i];
        }
        for (int num : ans) {
            System.out.print(num + ",");
        }
    }
}
