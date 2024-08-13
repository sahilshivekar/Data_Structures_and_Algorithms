/*
 * leetcode: 45. Jump Game II 
 */
package arrays;

public class jumpGameII {
    /*
     * O(n)
     * bcz even though there are nested loops they are reaching each index only
     * once.
     * 
     * O(1)
     * 
     * In this approach we use sliding window to check from which position we can
     * jump to the farthest and keep moving the sliding window till the right
     * pointer is equal or greater than the index of last element.
     */
    public static int jump(int[] nums) {
        int l = 0, r = 0;
        int farthest = 0;
        int count = 0;
        while (r < nums.length - 1) {
            for (int i = l; i <= r; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            l = r + 1;
            r = farthest;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 1, 1, 4 };
        System.out.println(jump(nums));
    }
}
