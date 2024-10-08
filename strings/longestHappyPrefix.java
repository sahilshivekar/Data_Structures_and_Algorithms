/*
 * geeks for geeks: longest prefix suffix
 * leetcode: 1392. Longest Happy Prefix
 */

package strings;

public class longestHappyPrefix {

    /*
     * by using kmp algorithm
     */
    public String longestPrefixSol1(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int pre = 0;

        for (int suf = 1; suf < n; suf++) {
            if (s.charAt(pre) == s.charAt(suf)) {
                lps[suf] = ++pre;
            } else if (pre > 0) {
                pre = lps[pre - 1];
                suf--;
            }
        }

        return s.substring(0, lps[lps.length - 1]);
    }
    
    /*
     * by using rolling hash like rabin karp algo
     */
    public static String longestPrefixSol2(String s) {
        long hp = 0, hs = 0, mod = 1000000007, pow = 1;
        int n = s.length(), p = 101, ans = 0;

        for (int i = 0; i < n - 1; i++) {
            hp = (hp + (s.charAt(i) * pow) % mod) % mod;
            hs = ((hs * p) % mod + s.charAt(n - 1 - i));
            pow = (pow * p) % mod;
            if (hp == hs)
                ans = i + 1;
        }
        return s.substring(0, ans);
    }
}
