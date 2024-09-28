/*
 * leetcode: 14. Longest Common Prefix
 */

package strings;

import java.util.*;

public class longestCommonPrefix {
    public String longestCommonPrefixSol(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        String str1 = strs[0];
        String str2 = strs[n - 1];
        int m = Math.min(str1.length(), str2.length());
        int idx = 0;
        for (int i = 0; i < m; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                idx++;
            } else {
                break;
            }
        }
        return str1.substring(0, idx);
    }
}
