/*
 * leetcode: 169. Majority Element
 */

package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class majorityElement {

    /*
     * this was my solution when i was solving the problem the idea was to sort
     * the array so it will be easy keep count of elements in linear manner
     * and then just find a element which count equals to n/2 + 1.
     * 
     * time: O(n logn + n) ~ O(n logn)
     * space: O(1)
     */
    public int majorityElementSolution1(int[] nums) {
        Arrays.sort(nums);
        int mIdx = 0;
        int curCount = 0;
        int count = (int) nums.length / 2 + 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[mIdx]) {
                curCount++;
            } else {
                curCount = 1;
                mIdx = i;
            }
            if (curCount == count) {
                return nums[mIdx];
            }
        }
        return nums[mIdx];
    }

    /*
     * below solution made use of a simple logic that if the element is major
     * then it will come at the center after solving and we just return that.
     * 
     * time: O(n logn) only sorting no additional loop
     * space: O(1)
     */
    public int majorityElementSoluiton2(int[] nums) {
        Arrays.sort(nums);
        return nums[(int) nums.length / 2];
    }

    /*
     * soluiton using hashmap
     * 
     * time: O(n)
     * space: O(n)
     * 
     */
    class Solution {
        public int majorityElementSolution3(int[] nums) {
            int n = nums.length;
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }

            n = n / 2;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > n) {
                    return entry.getKey();
                }
            }

            return 0;
        }
    }

    /*
     * most optimal solution
     * 
     * time: O(n)
     * space: O(1)
     * 
     * watch neetcode io video for revision bcz its difficult to write the '
     * explaination.
     * 
     * this algo works bcz there is gurantee that a majority element exists.
     */
    public int majorityElementSolution(int[] nums) {
        int count = 0;
        int res = 0;
        for (int num : nums) {
            if (count == 0)
                res = num;
            count += num == res ? 1 : -1;
        }
        return res;
    }
}