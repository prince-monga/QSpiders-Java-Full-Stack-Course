//! Array Union--
//Array Union-- is a method of combining two arrays into one, while ensuring that there are no duplicate elements in the resulting array. This can be achieved using various techniques, such as using a Set to store unique values or using the filter method to remove duplicates.

//? 1) Basic Question: Find Union of Two Arrays
// Question

// Write a program to find the union of two arrays.

//? 2) Union Size Only
// Question

// Find only the count of unique elements in the union.

//? 3) Union Without Using HashSet

// 👉 Interviewers sometimes ask this to test logic.

// Question

// Find union without using HashSet.

// Logic

// First copy all elements of first array

// Then for second array, add only if not already present


//^ Q4---- Two Sum -->
// Question

// Given an array of integers and a target sum, find all unique pairs of integers in the array that add up to the target sum.

//-----> [5,3,4,5,1,6], target = 10
// Output: [[4,6],[5,5]]

// Logic

// 1) get Ist element  ---using outer loop 
// 2) get 2nd element  --using inner loop because it runs for each element of outer loop
// 3) check if sum is equal to target
// 4) if yes, add to result array
// 5) repeat for all elements


