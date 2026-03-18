//^ Sorting Algorithms

//? Time Complexcity O(n*n)
//- bubble sort
//- selection sort
//- insertion sort

//? Time Complexcity O(n log n)
//- merge sort
//- quick sort
//- heap sort

//? Time Complexcity O(n)
//- counting sort
//- radix sort
//- bucket sort

//? Space Complexcity O(1)
//- bubble sort
//- selection sort
//- insertion sort
//- quick sort
//- heap sort

//* Bubble Sort - O(n²) time, O(1) space
/*!  arr={5, 2, 9, 1, 5, 6}

--1st pass:
5 2 9 1 5 6

2 5 9 1 5 6  // Compare 5 and 2, swap them
5 9 1 5 6      // Compare 5 and 9, no swap
5 9 1 5 6      // Compare 9 and 1, swap them
5 9 5 1 6      // Compare 9 and 5, swap them
5 9 5 6 1      // Compare 9 and 6, swap them
2 5 9 1 5 6     // Compare 5 and 2, swap them
2 5 1 9 5 6     // Compare 5 and 1, swap them
2 5 1 5 9 6     // Compare 9 and 5, swap them
2 5 1 5 6 9     // Compare 9 and 6, swap them

--2nd pass:
2 5 1 5 6 9     // Compare 2 and 5, no swap
2 5 1 5 6 9     // Compare 5 and 1, swap them
2 1 5 5 6 9     // Compare 5 and 1, swap them
2 1 5 5 6 9     // Compare 5 and 5, no swap
2 1 5 5 6 9     // Compare 5 and 6, no swap

--3rd pass:
2 1 5 5 6 9     // Compare 2 and 1, swap them
1 2 5 5 6 9     // Compare 2 and 1, swap them
1 2 5 5 6 9     // Compare 2 and 5, no swap
1 2 5 5 6 9     // Compare 5 and 5, no swap
1 2 5 5 6 9     // Compare 5 and 6, no swap


1 2 5 5 6 9     // No swaps needed, array is sorted
Example:
*/
function bubbleSort(arr) {
    const n = arr.length;
    for (let i = 0; i < n - 1; i++) {
        for (let j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
            }
        }
    } 
}
 

//* 2nd  Selection Sort - O(n²) time, O(1) space
/*!  arr={64, 25, 12, 22, 11}
--1st pass:
64 25 12 22 11   // Initial array
11 25 12 22 64   // Minimum is 11, swap with first element

--2nd pass:
11 25 12 22 64   // Starting from second element
11 12 25 22 64   // Minimum is 12, swap with second element

--3rd pass:
11 12 25 22 64   // Starting from third element
11 12 22 25 64   // Minimum is 22, swap with third element

--4th pass:
11 12 22 25 64   // Starting from fourth element
11 12 22 25 64   // Minimum is 25, swap with fourth element (no change)
11 12 22 25 64   // No swaps needed, array is sorted



*/
//Example:
function selectionSort(arr) {
    const n = arr.length;
    for (let i = 0; i < n - 1; i++) {
        let minIndex = i;
        for (let j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        if (minIndex !== i) {
            [arr[i], arr[minIndex]] = [arr[minIndex], arr[i]];
        }
    }
}