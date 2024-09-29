/*
 * leetcode: 3. Longest Substring Without Repeating Characters
 */

package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    /*
     * using set
     */
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int n = s.length();

        for (int l = 0, r = 0; r < n; r++) {
            char c = s.charAt(r);
            if (!set.contains(c)) {
                set.add(c);
                maxLen = Math.max(maxLen, r - l + 1);
            } else {
                while (set.contains(c)) {
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(c);
            }
        }

        return maxLen;
    }

    /*
     * using hashmaps
     */
    public int lengthOfLongestSubstring1(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int n = s.length();

        for (int l = 0, r = 0; r < n; r++) {
            char ch = s.charAt(r);
            if (map.containsKey(ch)) {
                l = Math.max(l, map.get(ch) + 1);
            }
            map.put(ch, r);
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }

    /*
     * using array
     */
    public int lengthOfLongestSubstring2(String s) {
        int maxLen = 0;
        int[] occ = new int[128];
        Arrays.fill(occ, -1);

        for (int l = 0, r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (occ[c] >= l) {
                l = occ[c] + 1;
            }
            occ[c] = r;
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
}
