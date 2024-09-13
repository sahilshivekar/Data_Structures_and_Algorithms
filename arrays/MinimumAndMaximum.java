package arrays;

import java.util.*;

/*
* Given an array of size N. The task is to find the maximum and the minimum 
* element of the array using the minimum number of comparisons.k
*/

public class MinimumAndMaximum {

    /*
     * One way is to linearly search in the array and update the value of max and
     * min varialbe.
     */
    public static int linearApproachMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int linearApproachMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /*
     * Another way is to sort and array and then return the first and last element
     * of the array.
     */

    static class Pair {
        public int max;
        public int min;
    }

    public static Pair bySorting(int[] arr) {
        Arrays.sort(arr);
        Pair minmax = new Pair();
        minmax.max = arr[arr.length - 1];
        minmax.min = arr[0];
        return minmax;
    }

    /*
     * Another way is to use Tournament method/ MinMax algorithm divide and conquer
     * 
     * time: O(n)
     * space: O(logn)
     * 
     * no of comparisons
     * T(n) = T(floor(n/2)) + T(ceil(n/2)) + 2
     * T(n) = 2T(n/2) + 2
     * 
     * and after solving this recurrence relation we get
     * T(n) = 3n/2 -2
     */
    public static Pair MinMax(int[] arr, int left, int right) {
        Pair mm = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();

        if (left == right) {
            mm.min = arr[left];
            mm.max = arr[left];
            return mm;
        } else if (left + 1 == right) {
            if (arr[left] < arr[right]) {
                mm.min = arr[left];
                mm.max = arr[right];
            } else {
                mm.min = arr[right];
                mm.max = arr[left];
            }           
            return mm;
        } else {
            int mid = left + (right - left) / 2;
            mml = MinMax(arr, left, mid);
            mmr = MinMax(arr, mid + 1, right);
            mm.max = Math.max(mml.max, mmr.max);
            mm.min = Math.min(mml.min, mmr.min);
            return mm;
        }
    }

    /*
     * another approach is to compare in pairs this is the most optimal solution
     * on geeks for geeks bcz it does
     * 3*(n - 1)/2 comparisons when n is odd
     * and
     * 1 + 3*(n - 2)/2 comparisons when n is even
     */

    public static Pair byPairing(int[] arr, int n) {
        Pair maxmin = new Pair();
        int i = 0;

        if (n % 2 == 0) {
            if (arr[0] < arr[1]) {
                maxmin.max = arr[1];
                maxmin.min = arr[0];
            } else {
                maxmin.max = arr[0];
                maxmin.min = arr[1];
            }
            i = 2;
        } else {
            maxmin.max = arr[0];
            maxmin.min = arr[0];
            i = 1;
        }

        while (i < n - 1) {
            if (arr[i] < arr[i + 1]) {
                if (arr[i + 1] > maxmin.max) {
                    maxmin.max = arr[i + 1];
                }
                if (arr[i] < maxmin.min) {
                    maxmin.min = arr[i];
                }
            } else {
                if (arr[i] > maxmin.max) {
                    maxmin.max = arr[i];
                }
                if (arr[i + 1] < maxmin.min) {
                    maxmin.min = arr[i + 1];
                }
            }
            i = i + 2;
        }
        return maxmin;
    }

    public static void main(String args[]) {
        int[] arr = { 3, 5, 4, 1, 9 };

        System.out.println("Using Linear search");
        System.out.println("Maximum element: " + linearApproachMax(arr));
        System.out.println("Minimum element: " + linearApproachMin(arr));
        System.out.println();

        System.out.println("Using sorting approach");
        Pair maxmin = bySorting(arr);
        System.out.println("Maximum element: " + maxmin.max);
        System.out.println("Minimum element: " + maxmin.min);
        System.out.println();

        System.out.println("Using Tournament method / MinMax algorithm divide and conquer");
        Pair MinMax = MinMax(arr, 0, arr.length - 1);
        System.out.println("Maximum element: " + MinMax.max);
        System.out.println("Minimum element: " + MinMax.min);
        System.out.println();

        System.out.println("By comparing in pairs");
        Pair paring = byPairing(arr, arr.length);
        System.out.println("Maximum element: " + paring.max);
        System.out.println("Minimum element: " + paring.min);
        System.out.println();
    }
}
