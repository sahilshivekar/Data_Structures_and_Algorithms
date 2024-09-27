/*
 * geeks for geeks - Print all combinations | Set-2
 */

package arrays;

import java.util.*;

public class PrintAllCombinationsSet2 {

    /*
     * by using recursion inside loop
     */
    public static void combinationUtilIterative(int[] arr, int[] data, int r, int di, int si, int ei) {
        if (di == r) {
            for (int d : data) {
                System.out.print(d + " ");
            }
            System.out.println();
            return;
        }

        for (int i = si; i <= ei && ei - i + 1 >= r - di; i++) {
            data[di] = arr[i];
            combinationUtilIterative(arr, data, r, di + 1, i + 1, ei);
        }
    }

    public static void printCombinationIterative(int[] arr, int n, int r) {
        int[] data = new int[r];
        combinationUtilIterative(arr, data, r, 0, 0, n - 1);
    }

    /*
     * by using recursion only
     */
    public static void combinationUtilRecursive(int[] arr, int[] data, int r, int di, int si, int ei) {
        if (di == r) {
            for (int d : data) {
                System.out.print(d + " ");
            }
            System.out.println();
            return;
        }
        if (si > ei) {
            return;
        }
        data[di] = arr[si];
        combinationUtilRecursive(arr, data, r, di + 1, si + 1, ei);

        /* to remove duplicates */
        while (si < ei && arr[si] == arr[si + 1]) {
            si++;
        }

        combinationUtilRecursive(arr, data, r, di, si + 1, ei);
    }

    public static void printCombinationRecursive(int[] arr, int n, int r) {
        int[] data = new int[r];
        Arrays.sort(arr); // sorting the array so that removing duplicates will be possible
        combinationUtilRecursive(arr, data, r, 0, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 1 };
        int r = 3;
        int n = arr.length;
        // printCombinationIterative(arr, n, r);
        printCombinationRecursive(arr, n, r);
    }
}
