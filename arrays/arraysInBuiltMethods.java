package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class arraysInBuiltMethods {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // ! Java Array Methods and Operations
        /*
         * Most Frequently Used Methods and Operations
         */

        // Declares and initializes an array.
        int[] arr = { 1, 2, 3, 4, 5 };

        // Accesses an element at a specific index in the array.
        int element = arr[0];

        // Modifies an element at a specific index in the array.
        arr[0] = 10;

        // Gets the length of the array.
        int length = arr.length;

        // Iterates through the array using a for loop.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Iterates through the array using an enhanced for loop (for-each).
        for (int num : arr) {
            System.out.println(num);
        }

        // Copies an array using the Arrays.copyOf method.
        int[] newArr = Arrays.copyOf(arr, arr.length);

        // Sorts the array using the Arrays.sort method.
        Arrays.sort(arr);

        // Converts the array to a string using Arrays.toString for easy printing.
        String arrayString = Arrays.toString(arr);
        System.out.println(arrayString);

        // Checks if two arrays are equal using Arrays.equals method.
        boolean isEqual = Arrays.equals(arr, newArr);

        /*
         * Less Frequently Used Methods and Operations
         */
        // Fills the array with a specific value using Arrays.fill method.
        Arrays.fill(arr, 0);

        // Copies a range of elements from an array using Arrays.copyOfRange.
        int[] rangeArr = Arrays.copyOfRange(arr, 1, 3);

        // Sorts the array in parallel using Arrays.parallelSort for large arrays.
        Arrays.parallelSort(arr);

        // Searches for a value in the array using Arrays.binarySearch (the array must
        // be sorted).
        int index = Arrays.binarySearch(arr, 10);

        // Returns a stream of the array elements using Arrays.stream for functional
        // operations.
        IntStream stream = Arrays.stream(arr);
        stream.forEach(System.out::println);

        // Converts an array to a List using Arrays.asList (works with Object arrays,
        // not primitive arrays).
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Creates a new array by copying a subset of the original array using
        // System.arraycopy.
        int[] destArr = new int[3];
        System.arraycopy(arr, 0, destArr, 0, 3);

        /*
         * Remaining Methods and Operations
         */
        // Sets all elements of an array to the specified value using Arrays.setAll.
        Arrays.setAll(arr, i -> i + 1);

        // Generates an array using a generator function with Arrays.generate.
        int[] generatedArr = new int[5];
        Arrays.setAll(generatedArr, i -> i * 2);

        // Calculates the sum of elements in an array using IntStream.sum.
        int sum = Arrays.stream(arr).sum();

        // Converts a List to an array using List.toArray.
        List<String> strList = Arrays.asList("a", "b", "c");
        String[] strArr = strList.toArray(new String[0]);

        // Sorts the array using a custom comparator with Arrays.sort.
        Integer[] arr1 = { 1, 2, 3, 4, 5 };
        Arrays.sort(arr1, Collections.reverseOrder());

        // Converts a multidimensional array to a string using Arrays.deepToString.
        int[][] multiArr = { { 1, 2 }, { 3, 4 } };
        String multiArrString = Arrays.deepToString(multiArr);
        System.out.println(multiArrString);

        // Compares two multidimensional arrays using Arrays.deepEquals.
        int[][] anotherMultiArr = { { 1, 2 }, { 3, 4 } };
        boolean multiArrEqual = Arrays.deepEquals(multiArr, anotherMultiArr);

        // Performs parallel prefix computation on the array using
        // Arrays.parallelPrefix.
        Arrays.parallelPrefix(arr, (x, y) -> x + y);

        // Finds the minimum and maximum values in an array using IntStream.
        int min = Arrays.stream(arr).min().orElseThrow();
        int max = Arrays.stream(arr).max().orElseThrow();

    }
}
