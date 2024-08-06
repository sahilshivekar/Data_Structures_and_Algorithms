/*
* leetcode: 167. Two Sum II - Input Array Is Sorted
*/

package arrays;

public class twoSumTwo {
    /*
     * time: O(n)
     * space: O(1)
     * 
     * In this approach we sort the array is already sorted.
     * We find the two numbers that sums up to the target using two pointers for
     * efficiency.
     */
    public static int[] twoSumTwoPointer(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum > target) {
                r--;
            } else if (sum < target) {
                l++;
            } else {
                return new int[] { l + 1, r + 1 };
            }
        }
        return new int[] {};
    }

}
