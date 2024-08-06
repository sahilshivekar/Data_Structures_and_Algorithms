/*
* leetcode: 53. Maximum Subarray
*/

package arrays;

public class maximumSubarray {

    /*
     * time: O(n)
     * space: O(1)
     * 
     * In this approach kadane's algorithm is used.
     */
    public static int maxSubArray(int nums[]) {
        int maxSum = nums[0], curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            maxSum = Math.max(curSum, maxSum);
            if (curSum < 0)
                curSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(maxSubArray(nums));
    }
}
