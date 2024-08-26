/*
 * leetcode: 80. Remove Duplicates from Sorted Array II
 */
package arrays;

public class removeDuplicatesII {
    /*
     * This was my solution it also beated 100% of other solutions.
     * The approach is we keep a idx which is the slow pointer it shifts only if
     * the idx-2 element is not same as the ith element.
     * 
     * time: O(n)
     * space: O(1)
     */
    public int removeDuplicates1(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int count = 2;
        int idx = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[idx - 2] == nums[i]) {
                if (i == idx)
                    idx = i;
            } else {
                nums[idx++] = nums[i];
                count++;
            }
        }
        return count;
    }

    /*
     * another optimal upvoted solution and it is shorter
     * 
     * in this solution there is no variable keeping the count of the elements
     * its returning the idx bcz that is the last place where we was pointing 
     * and since idx was started from 0 then we don't have to increase it by 1 
     * bcz in the loop we are doing idx++.
     * 
     * also its checking the idx with or operator and the idx < 2 condition
     * is written before the condition nums[idx - 2] which is saving allowing
     * it run without index outof bounds error
     */
    public int removeDuplicates2(int[] nums) {
        int idx = 0;
        for (int num : nums) {
            if (idx < 2 || nums[idx - 2] < num) {
                nums[idx++] = num;
            }
        }
        return idx;
    }
}
