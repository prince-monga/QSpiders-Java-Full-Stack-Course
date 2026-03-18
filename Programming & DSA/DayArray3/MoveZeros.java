package DayArray3;
/* Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
 */
public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 3, 12 };
        
        int insertPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[insertPos++] = arr[i];
            }
        }
        while (insertPos < arr.length) {
            arr[insertPos++] = 0;
        }
        // Print the result to verify
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
