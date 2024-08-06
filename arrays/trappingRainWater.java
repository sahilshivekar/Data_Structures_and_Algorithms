/*
* leetcode: 42. Trapping Rain Water
*/

package arrays;

public class trappingRainWater {

    /*
     * time: O(n)
     * space: O(n)
     * 
     * In this approach we are checking the maximum height on the left and right
     * side of
     * each bar.
     * 
     * We are creating two arrays to store maximum height in the left and right side
     * of
     * each bar (leftMax[n], rightMax[n]).
     * 
     * Then for each bar determine the boundary which will be the minimum of
     * leftMax[i]
     * and rightMax[i].
     * 
     * Then check the gap between boundary and height[i] (bcz if height of boundary
     * and
     * that bar is 2 - 2 then no water can be trapped) and if its greater than zero
     * then
     * do units += gap
     */
    public static int trap(int[] height) {

        int n = height.length;
        int units = 0;
        int k = n - 2;

        int rightMax[] = new int[n];
        int leftMax[] = new int[n];

        leftMax[0] = height[0];
        rightMax[n - 1] = height[n - 1];

        for (int i = 1; i < n; i++) {
            leftMax[i] = height[i] > leftMax[i - 1] ? height[i] : leftMax[i - 1];
            rightMax[k] = height[k] > rightMax[k + 1] ? height[k] : rightMax[k + 1];
            k--;
        }

        for (int i = 0; i < n; i++) {
            int boundary = Math.min(leftMax[i], rightMax[i]);
            int gap = boundary - height[i];
            if (gap > 0) {
                units += gap;
            }
        }

        return units;
    }

    /*
     * time: O(n)
     * space: O(1)
     * 
     * In this approach we are using two pointer one on left and one on right. 
     * We will use two variables to keep track of leftMax and rightMax, we will select
     * minimum of these two variables to decide which pointer to shift and calculate the
     * water. (becasue suppose if we have the leftMax as 4 and rightMax as 5 then we will
     * select to move left pointer bcz we know that on the left Side the bar can
     * store maximum 4 units of water) 
     */

     public int trapTwoPointer(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int leftMax = height[l];
        int rightMax = height[r];
        int res = 0;

        while (l < r) {
            if (leftMax < rightMax) {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                res += leftMax - height[l];

            } else {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(height));
    }
}
