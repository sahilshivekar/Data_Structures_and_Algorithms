/*
 * leetcode: 54. Spiral Matrix
 */

package arrays;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {

    /*
     * time: O(m*n)
     * because each element is getting accessed exactly once
     * 
     * space:O(1)
     * 
     * The if condition for the last two for loops is to handle corner case
     * to understand it clearly make dry run for 3*4 and 4*3 matrix.
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;
        int rowStart = 0;
        int colStart = 0;

        while (colStart <= colEnd && rowStart <= rowEnd) {

            for (int j = colStart; j <= colEnd; j++) {
                ans.add(matrix[rowStart][j]);
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                ans.add(matrix[i][colEnd]);
            }
            colEnd--;

            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    ans.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }

            if (colStart <= colEnd) {
                for (int j = rowEnd; j >= rowStart; j--) {
                    ans.add(matrix[j][colStart]);
                }
                colStart++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(spiralOrder(matrix));
    }
}
