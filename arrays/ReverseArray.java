package arrays;

import java.util.*;

public class ReverseArray {

    /*
     * time: o(n)
     * space: O(n)
     * 
     * Create a new array of the same size as the original array.
     * Copy elements from the original array to the new array in reverse order.
     */
    public static void reverse1(int[] arr) {
        int[] clone = arr.clone();
        for (int i = 0; i < clone.length; i++) {
            arr[i] = clone[clone.length - 1 - i];
        }
    }

    /*
     * time: O(n)
     * space: O(1)
     * 
     * Iterate through the array using two pointers (start and end).
     * Swap elements at the start and end pointers.
     * Move the start pointer towards the end and the end pointer towards the start
     * until they meet or cross each other.
     */
    public static void reverse2(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    /*
     * time: O(n)
     * space: O(1)
     * 
     * Use inbuilt methods
     */
    public static void reverse3(Integer[] arr2) {
        List<Integer> list = Arrays.asList(arr2);
        Collections.reverse(list);
        // list.set(5, 34554);
        // System.out.println(Arrays.toString(arr2));
    }

    /*
     * time: O(n)
     * space: O(n)
     * 
     * Define a recursive function that takes an array as input.
     * Swap the first and last elements.
     * Recursively call the function with the remaining subarray.
     */
    public static void reverse4(int[] arr, int left, int right) {
        if (left >= right)
            return; // don't write condition as < bcz if there is only one element in the array it
                    // will never return anything
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverse4(arr, left + 1, right - 1);
    }

    /*
     * time: O(n)
     * space: O(n)
     * 
     * Push each element of the array onto a stack.
     * Pop elements from the stack to form the reversed array.
     */
    public static void reverse5(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) stack.push(i);
        for (int i = 0; i < arr.length; i++) arr[i] = stack.pop();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // Integer[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // reverse3(arr2);
        // System.out.println(Arrays.toString(arr2));
        reverse4(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
