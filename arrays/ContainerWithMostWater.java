/*
 * leetcode 11. Container With Most Water
 */

package arrays;

public class ContainerWithMostWater {
    public int maxAreaSol1(int[] height) {
        int l = 0, r = height.length - 1, maxWater = 0;
        while (l < r) {
            int minHeight = Math.min(height[l], height[r]);
            maxWater = Math.max(minHeight * (r - l), maxWater);
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxWater;
    }

    /*
     * saves the time for unnecessary calculation of minHeight and maxWater by
     * using a while loop instead of if conditon (the conditoin is slightly diff)
     */
    public int maxAreaSol2(int[] height) {
        int l = 0, r = height.length - 1, maxWater = 0;
        while (l < r) {
            int minHeight = Math.min(height[l], height[r]);
            maxWater = Math.max(minHeight * (r - l), maxWater);
            while (l < r && height[l] <= minHeight) {
                l++;
            }
            while (l < r && height[r] <= minHeight) {
                r--;
            }
        }
        return maxWater;
    }
}
