/*
 * leetcode 238. Product of Array Except Self
 */
package arrays;

public class ProductOfArrayExceptSelf {

    /*
     * use auxillary arrays to calculate prefix and suffix of the array in a single
     * loop to avoid redundant calculations
     */
    public int[] productExceptSelfSol1(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = prefix[i] * suffix[i];
        }

        return nums;
    }

    /*
     * Uses constant space (space for the answer is not counted)
     */
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[nums.length];

        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int cal = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= cal;
            cal *= nums[i];
            // we can't use the same type of pattern of calculation
            // used in previous for loop bcz during this for loop we are not having
            // the suffix calculation stored in the ans[i + 1] but the final ans
        }
        return ans;
    }
}
