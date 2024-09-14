/*
 * leetcode: 217. Contains Duplicate
 */
package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    /*
     * In this approach array is firstly sorted and then each element is compared
     * with its previous and if they are same return true.
     * 
     * time: O(n logn) uses sorting
     * space: O(1)
     */

    public static boolean containsDuplicateSol1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return true;
            }
        }
        return false;
    }

    /*
     * Use hashmap
     * 
     * time: O(n)
     * space: O(1)
     */

    public static boolean containsDuplicateSol2(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) // takes constant time
                return true;
            else
                map.put(nums[i], false); // takes constant time
        }
        return false;
    }

    /*
     * Use set
     * 
     * time: O(n)
     * space: O(1)
     */
    public static boolean containsDuplicateSol3(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i]) == false)
                return true;
        }
        return false;
    }
}
