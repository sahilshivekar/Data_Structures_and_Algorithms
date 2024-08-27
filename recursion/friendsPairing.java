/*
 * problem not from leetcode
 */
package recursion;

public class friendsPairing {

    /*
     * in this problem each friend have two choices and they all will choose to be
     * single at first. then from bottom to top each friend chooses to pair. then we
     * multiple (n - 1) remaining friends with the sol(n - 2) bcz the person can
     * choose to be friend with anyone right.
     * 
     * time: O(2**n)
     * spcae: O(n)
     */
    public static int sol(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return sol(n - 1) + (n - 1) * sol(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(sol(5));
    }
}