/*
 * leetcode 215. Kth Largest Element in an Array
 */
package arrays;

import java.util.Arrays;

public class KthLargestElementInArray {

    /*
     * sort the array and return the n - k idx
     */
    public int findKthLargestSol1(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
    
    /*
     * using similar partitioning used in quick sort
     */
    public static int quickSelect(int[] nums, int l, int r, int k) {
        int pivot = nums[r];
        int pIdx = l;
        for (int i = l; i < r; i++) {
            if (nums[i] < pivot) {
                int temp = nums[pIdx];
                nums[pIdx] = nums[i];
                nums[i] = temp;
                pIdx++;
            }
        }
        int temp = nums[pIdx];
        nums[pIdx] = nums[r];
        nums[r] = temp;
        if (pIdx < k) {
            return quickSelect(nums, pIdx + 1, r, k);
        } else if (pIdx > k) {
            return quickSelect(nums, l, pIdx - 1, k);
        } else {
            return nums[pIdx];
        }
    }

    public int findKthLargestSol2(int[] nums, int k) {
        k = nums.length - k;
        int ele = quickSelect(nums, 0, nums.length - 1, k);
        return ele;
    }
}
