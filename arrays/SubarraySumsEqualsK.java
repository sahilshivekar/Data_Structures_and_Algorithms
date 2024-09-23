/*
 * leetcode 560. Subarray Sum Equals K
 */

package arrays;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumsEqualsK {

    /*
     * this solution beating only 37% but it should acutally take lesser time than
     * the solution listed below
     */
    public int sol1(int[] nums, int k) {
        int ans = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) {
                ans++;
            }
            ans += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }

    /*
     * this solution surprisingly beats 99.18% of other solutions
     */
    public int sol2(int[] nums, int k) {
        int n = nums.length;
        int[] prefix = new int[n];

        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (prefix[i] == k) {
                ans++;
            }

            ans += map.getOrDefault(prefix[i] - k, 0);
            map.put(prefix[i], map.getOrDefault(prefix[i], 0) + 1);
        }

        return ans;
    }
}
