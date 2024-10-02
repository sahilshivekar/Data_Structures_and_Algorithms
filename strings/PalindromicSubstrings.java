/*
 * leetcode: 647. Palindromic Substrings
 */

package strings;

public class PalindromicSubstrings {

    /*
     * beats 95% on leetcode
     */
    public int findPalindrone(String s, int l, int r, int n) {
        int res = 0;
        while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
            res++;
        }
        return res;
    }
    public int countSubstrings(String s) {
        int res = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            res += findPalindrone(s, i , i, n);
            res += findPalindrone(s, i , i + 1, n);
        }
        return res;
    }
}
