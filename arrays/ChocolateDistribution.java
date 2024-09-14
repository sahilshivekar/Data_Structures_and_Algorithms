/*
 * From apna college 375 dsa sheet  
 */
package arrays;

import java.util.*;

public class ChocolateDistribution {

    public static int chocolateDistributionSol1(int[] nums, int n, int m) {
        if (n == 0 | m == 0) {
            return 0;
        }
        if (n < m) { // number of students must be lesser than number of packets
            return -1;
        }
        Arrays.sort(nums);
        int lastIdx = nums.length - m;
        int minDiff = Integer.MAX_VALUE;
        int diff;

        for (int i = 0; i <= lastIdx; i++) {
            diff = nums[i + m - 1] - nums[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int nums1[] = { 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 };
        int m1 = 7;
        int nums2[] = { 3, 4, 1, 9, 56, 7, 9, 12 };
        int m2 = 5;
        int nums3[] = { 7, 3, 2, 4, 9, 12, 56 };
        int m3 = 3;
        System.out.println(chocolateDistributionSol1(nums3, nums3.length, m3));
        System.out.println(chocolateDistributionSol1(nums2, nums2.length, m2));
        System.out.println(chocolateDistributionSol1(nums1, nums1.length, m1));
    }
}
