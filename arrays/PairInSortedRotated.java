/*
 * geeks for geeks: Find if there is a pair with a given sum in the rotated sorted Array
 * 
 * Given an array arr[] of distinct elements size N that is sorted and then rotated 
 * around an unknown point, the task is to check if the array has a pair with a given 
 * sum X.
 */

package arrays;

public class PairInSortedRotated {

    public static boolean findPair(int[] nums, int target) {
        int l = findMin(nums);
        int r = l == 0 ? nums.length - 1 : l - 1;

        while (l != r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                return true;
            } else if (sum > target) {
                r = (nums.length + r - 1) % nums.length; // to traverse in circular way
            } else {
                l = (l + 1) % nums.length;
            }
        }
        return false;
    }

    /*
     * same algo used in finding minimum in rotated sorted array written in
     * MinInRotatedSortedArray.java
     */
    public static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[r] < nums[m]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums1 = { 11, 15, 3, 6, 6, 8, 9, 10 };
        int[] nums2 = { 11, 15, 15, 26, 26, 38, 9, 10 };
        int targetSum1 = 16;
        int targetSum2 = 35;
        int targetSum3 = 45;

        System.out.println(findPair(nums1, targetSum1)); // true
        System.out.println(findPair(nums2, targetSum2)); // true
        System.out.println(findPair(nums2, targetSum3)); // false
    }
}
