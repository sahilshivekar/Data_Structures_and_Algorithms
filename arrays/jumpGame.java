/*
 * leetcode: 55. Jump Game
 */
package arrays;

public class jumpGame {
    /*
     * time: O(n)
     * space: O(1)
     * 
     * In this approach we move from last to start checking if jumping from this
     * position can take us to the last if yes then we set that postion as a last
     * position for the further elements of array.
     * If at the end last reaches the 0th index then it means the last index is
     * reachable by jumping from one to another postion.
     */
    public static boolean canJump(int[] nums) {
        int last = nums.length - 1;
        for (int i = last - 1; i >= 0; i--) {
            if (i + nums[i] >= last)
                last = i;
        }
        return last == 0;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 1, 1, 4 };
        System.out.println(canJump(nums));
    }
}
