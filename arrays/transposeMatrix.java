/*
 * leetcode: 867. Transpose Matrix
 */
package arrays;

public class transposeMatrix {

    /*
     * time: O(n*m)
     * space: O(n*m)
     */
    public static int[][] transpose(int[][] matrix) {
        int tran[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                tran[j][i] = matrix[i][j];
            }
        }
        return tran;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        int tran[][] = transpose(matrix);
        for (int[] row : tran) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}