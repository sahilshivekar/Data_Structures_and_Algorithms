/*
 * leetcode: 424. Longest Repeating Character Replacement
 */

package strings;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        int n = s.length();
        int[] count = new int[26];
        int maxF = 0;

        for (int l = 0, r = 0; r < n; r++) {
            char c = s.charAt(r);

            count[c - 'A']++;
            maxF = Math.max(maxF, count[c - 'A']);

            while (r - l + 1 - maxF > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
}
