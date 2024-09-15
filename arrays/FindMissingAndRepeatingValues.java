/*
 * leetcode 2965.Find Missing and Repeated Values
 */
package arrays;

public class FindMissingAndRepeatingValues {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] count = new int[(n * n) + 1];
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = grid[i][j];
                count[value]++;
                if (count[value] == 2) {
                    ans[0] = value;
                }
            }
        }
        for (int i = 1; i < (n * n) + 1; i++) {
            if (count[i] == 0) {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}
