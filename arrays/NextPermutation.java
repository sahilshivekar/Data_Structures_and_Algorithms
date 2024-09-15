/*
 * leetcode 31. Next Permutation
 */
package arrays;

public class NextPermutation {
    public static int findPivot(int[] nums, int n) {
        for (int i = n - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                return i - 1;
            }
        }
        return -1;
    }

    public static int findIdxToSwap(int[] nums, int pivot, int n) {
        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                return i;
            }
        }
        return -1;
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left++, right--);
        }
    }

    public static void nextPermutation(int[] nums) {
        int pivot = findPivot(nums, nums.length);
        if (pivot != -1) {
            int smallest = findIdxToSwap(nums, pivot, nums.length);
            swap(nums, pivot, smallest);
        }
        reverse(nums, pivot + 1, nums.length - 1);
    }
}
