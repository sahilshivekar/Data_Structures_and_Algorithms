/*
 * leetcode 974. Subarray Sums Divisible by K
 */

package arrays;

public class SubarraySumsDivisibleK {

    /*
     * most optimal solution
     * 
     * using array instead of hashmap adds more spead (but might take more space if
     * k is large)
     * bcz in some cases hashmap's constant time complexity is more than accessing
     * entire small array with small elements
     * and in this problem we know that arr length is always k
     */
    public int sol1(int[] nums, int k) {
        int sum = 0, count = 0;
        // using array instead of hashmap
        int[] freq = new int[k];
        freq[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % k;
            if (rem < 0) {
                rem += k;
            }
            count += freq[rem]++;
        }
        return count;
    }
}
