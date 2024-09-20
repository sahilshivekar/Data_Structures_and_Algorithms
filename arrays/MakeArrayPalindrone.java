/*
 * Find minimum number of merge operations to make an array palindrome
 * 
 * Given an array of positive integers. We need to make the given array a ‘Palindrome’.
 * The only allowed operation is”merging” (of two adjacent elements). Merging two adjacent
 * elements means replacing them with their sum. The task is to find the minimum number 
 * of merge operations required to make the given array a ‘Palindrome’.

 * To make any array a palindrome, we can simply apply merge operation n-1 times where n 
 * is the size of the array (because a single-element array is always palindromic, similar 
 * to single-character string). In that case, the size of array will be reduced to 1. But in 
 * this problem, we are asked to do it in the minimum number of operations.
 */

package arrays;

public class MakeArrayPalindrone {
    public static int makePalindrone(int[] arr) {
        int res = 0;
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            if (arr[l] == arr[r]) {
                l++;
                r--;
            } else if (arr[l] < arr[r]) {
                l++;
                arr[l] += arr[l - 1];
                res++;
            } else {
                r--;
                arr[r] += arr[r + 1];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // Test Case 1: Already a palindrome
        int[] arr1 = { 1, 2, 3, 2, 1 };
        System.out.println("Test Case 1: " + makePalindrone(arr1)); // Expected output: 0

        // Test Case 2: Simple merge required
        int[] arr2 = { 1, 4, 5, 9, 1 };
        System.out.println("Test Case 2: " + makePalindrone(arr2)); // Expected output: [number of merges required]

        // Test Case 3: All elements same
        int[] arr3 = { 3, 3, 3, 3 };
        System.out.println("Test Case 3: " + makePalindrone(arr3)); // Expected output: 0

        // Test Case 4: Large difference between elements
        int[] arr4 = { 11, 14, 15, 99 };
        System.out.println("Test Case 4: " + makePalindrone(arr4)); // Expected output: [number of merges required]

        // Test Case 5: Single element (already palindrome)
        int[] arr5 = { 42 };
        System.out.println("Test Case 5: " + makePalindrone(arr5)); // Expected output: 0

        // Test Case 6: Two elements (merge needed)
        int[] arr6 = { 7, 10 };
        System.out.println("Test Case 6: " + makePalindrone(arr6)); // Expected output: 1
    }
}
