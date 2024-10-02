/*
 * leetcode: 5. Longest Palindromic Substring
 */

package strings;

public class LongestPalindromicSubstring {

    /*
     * beats 94%
     */
    class StrLR {
        int l;
        int r;
        int maxLen;
        public StrLR(int l, int r, int maxLen){
            this.l = l;
            this.r = r;
            this.maxLen = maxLen;
        }
    }
    public StrLR findPalindrone(String s, int l, int r, int n) {
        while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return new StrLR(l + 1, r - 1, r - l + 1);
    }

    public String longestPalindrome(String s) {
        int maxLen = 0;
        int resL = 0;
        int resR = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            StrLR odd = findPalindrone(s, i , i, n);
            StrLR even = findPalindrone(s, i , i + 1, n);
            if(odd.maxLen > maxLen){
                maxLen = odd.maxLen;
                resL = odd.l;
                resR = odd.r;
            }
            if(even.maxLen > maxLen){
                maxLen = even.maxLen;
                resL = even.l;
                resR = even.r;
            }
        }
        return s.substring(resL, resR + 1);
    }
}
