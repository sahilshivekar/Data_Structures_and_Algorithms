/*
 * leetcode: 74. Search a 2D Matrix
 */

package arrays;

public class search2DMatrix {

    /*
     * time: O(m log n)
     * space: O(1)
     * 
     */
    public static boolean bs(int[][] matrix, int target, int row, int right) {
        int left = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target < matrix[row][mid]) {
                right = mid - 1;
            } else if (target > matrix[row][mid]) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int col = 0;
        int row = matrix.length - 1;
        while (col < matrix[0].length && row >= 0) {
            if (matrix[row][col] < target) {
                col++;
            } else if (matrix[row][col] > target) {
                row--;
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
        System.out.println(searchMatrix(matrix, 6)); // true
    }
}