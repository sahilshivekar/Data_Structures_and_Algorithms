/*
 * leetcode: 240. Search a 2D Matrix II
 */

package arrays;

public class search2DMatrixII {

    /*
     * time: O(m + n)
     * space: O(1)
     * 
     * In this approach we start from the top right corner and bcz the matrix
     * is sorted horizontally and vertically we move down if the target is
     * bigger and move left if the target is smaller.
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length - 1;
        int row = 0;
        while (col >= 0 && row < matrix.length) {
            if (matrix[row][col] < target) {
                row++;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(searchMatrix(matrix, 6)); //true
    }
}