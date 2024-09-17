/*
 * leetcode 152. Maximum Product Subarray
 */
package arrays;

public class MaximumProductSubarray {

    /*
     * watch the video on take U forward best explaination of this code
     */
    public int maxProductSol1(int[] nums) {
        int res = nums[0], pref = 0, suff = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            pref = (pref == 0 ? 1 : pref) * nums[i];
            suff = (suff == 0 ? 1 : suff) * nums[n - 1 - i];
            res = Math.max(res, Math.max(pref, suff));
        }
        return res;
    }

    /*
     * refer to notes to get this
     */
    public int maxProductSol2(int[] nums) {
        int res = nums[0];
        int curMax = res;
        int curMin = res;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = curMax;
                curMax = curMin;
                curMin = temp;
            }
            curMax = Math.max(nums[i], nums[i] * curMax);
            curMin = Math.min(nums[i], nums[i] * curMin);
            res = Math.max(curMax, res);
        }
        return res;
    }

}