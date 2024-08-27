/*
 * this problem is not from leetcode. the problem name is "tiling problem" from the course
 */

package recursion;

public class tilingProblem {

    // i got how its working but not getting why it works
    public static int sol(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        // vertical
        int fnm1 = sol(n - 1);

        // horizontal
        int fnm2 = sol(n - 2);
        return fnm1 + fnm2;
    }

    public static void main(String[] args) {
        System.out.println(sol(9));
    }
}
