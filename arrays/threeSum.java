/*
* leetcode: 15. 3Sum
*/

package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {

    /*
     * time: O(n**2)
     * space: O(n**2)
     * the space complexity of the algorithm is dominated by the storage required
     * for the result list. In the worst case, this can be O(n**2) for the space
     * required to store all possible triplets (although practically, it is often
     * much less).
     * 
     * In this approach we sort the array and iterate through each ith element once
     * (ensuring it's not the duplicate) and then for each ith element we find the
     * two numbers that sums up to the apposite sign of the current ith element
     * using two pointers for efficiency.
     */
    public static List<List<Integer>> threeSumWithTwoPointer(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0)
            return new ArrayList<>(res);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int twoSum = nums[l] + nums[r];
                if (twoSum > -nums[i]) {
                    r--;
                } else if (twoSum < -nums[i]) {
                    l++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
                    while (nums[l] == nums[l - 1] && l < r) {
                        l++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSumWithTwoPointer(nums));
    }
}
