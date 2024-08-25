/*
 * leetcode: 26. Remove Duplicates from Sorted Array
 */

package arrays;

public class removeDuplicates {

    /*
     * As the problem states we have to return the first k numbers which are unique
     * if the remaining elements in the array are not unique then its okay. bcz only
     * the first k elements matters.
     * 
     * so we use similar slow and fast pointer approach we used in the remove
     * element problem. we keep the slow pointer at the start and if the element
     * pointed by the fast pointer is diff then we first increment the slow pointer
     * and then store the value. the count is initialized to one bcz there will be
     * atleast one unique number in the array bcz the minimum length can be 1.
     * 
     * time: O(n)
     * space: O(1)
     */
    public static int solution(int[] nums) {
        int u = 0;
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[u]) {
                nums[++u] = nums[i];
                count++;
            }
        }
        return count;
    }
}
