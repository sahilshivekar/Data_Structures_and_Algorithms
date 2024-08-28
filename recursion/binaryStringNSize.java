/*
 * this problem is not from leetcode
 */
package recursion;

/*
 * problem statement: print all possible combinations of stirng that only contains
 * 0s and 1s for a length n without consecutive 1s
 */
public class binaryStringNSize {

    /*
     * time: O(2**n)
     * space: O(n)
     */
    public static void sol(int n, String s, char p) {
        if (n == 0) {
            System.out.println(s);
            return;
        }
        if (p == '0') {
            sol(n - 1, s + '1', '1');
        }
        sol(n - 1, s + '0', '0');
    }

    public static void main(String[] args) {
        sol(3, new String(""), '0');
    }
}
