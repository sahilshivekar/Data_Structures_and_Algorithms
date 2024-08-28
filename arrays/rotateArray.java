/*
 * leetcode: 189. Rotate Array
 */
package arrays;

public class rotateArray {

    /*
     * time: O(n)
     * space: O(n)
     */
    public static void rotateSol1(int[] nums, int k) {
        int[] copy = nums.clone();
        int n = nums.length;
        k = k % n;
        for (int i = 0; i < n; i++) {
            nums[(i + k) % n] = copy[i];
        }
    }

    /*
     * time: O(n + n) ~ O(n)
     * space: O(1)
     * 
     * most optimal
     * 
     * Go through only the rotateSol2 fun on paper and it will be clear
     */
    public static void rotateSol2(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int si, int ei) {
        while (si < ei) {
            int temp = nums[si];
            nums[si] = nums[ei];
            nums[ei] = temp;
            si++;
            ei--;
        }
    }
}
