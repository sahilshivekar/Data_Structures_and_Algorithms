package arrays;

public class matrixDiagonalSum{

    /*
     * time: O(n)
     * space: O(1)
     */
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += mat[i][i];
            sum += mat[n - 1 - i][i];
        }
        return n % 2 == 0 ? sum : sum - mat[n/2][n/2];
    }
    public static void main(String[] args) {
        int matrix[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
    };
    System.out.println(diagonalSum(matrix)); //25
    }
}