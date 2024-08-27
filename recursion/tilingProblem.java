/*
 * this problem is not from leetcode. the problem name is "tiling problem" from ac
 */

package recursion;

public class tilingProblem {

    /*
     * keep in mind while reading belows explaination that n is decreasing by 1 or 2
     * depending on the choice made by prev sol(n - ?)
     * 
     * it goes to the depth where each fun first chooses sol(n - 1) and goes to
     * the depth and secondly chooses sol(n - 2) and goes till the end until
     * it return 1 (it returns 1 when the second last fun chooses
     * sol(n-1) which results in as way 1 to the problem and then the second
     * last fun chooses sol(n-2) which results in as way 2 to the problem. this same
     * change in choice happens with each fun and then again it goes to the depth)
     * 
     *
     */
    public static int sol(int n) {
        if (n == 1 || n == 0) {
            // second last fun choosed sol(n-1) or sol(n-2)
            return 1;
        }

        // choice 1
        int fnm1 = sol(n - 1);

        // choice 2
        int fnm2 = sol(n - 2);

        return fnm1 + fnm2;
    }

    public static void main(String[] args) {
        System.out.println(sol(9));
    }
}
