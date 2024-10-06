/*
 * geeks for geeks: Smallest window in a string containing all the characters of another string. 
 * leetcode: 76. Minimum Window Substring
 */

package strings;

public class MinimumWindowSubstring {

    /*
     * sol 1 (Geeks For Geeks)
     */
    public static String smallestWindow(String s, String p) {
        int[] freqS = new int[26];
        int[] freqP = new int[26];
        int need = 0, have = 0;
        int n = s.length(), m = p.length();
        int l = 0, si = -1, ei = -1, minLen = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            char x = p.charAt(i);
            freqP[x - 'a']++;
            if (freqP[x - 'a'] == 1) {
                need++;
            }
        }

        for (int r = 0; r < n; r++) {
            char x = s.charAt(r);
            freqS[x - 'a']++;
            if (freqS[x - 'a'] == freqP[x - 'a']) {
                have++;
            }
            if (have == need) {
                while (freqS[s.charAt(l) - 'a'] > freqP[s.charAt(l) - 'a']) {
                    // System.out.print("s: " + freqS[s.charAt(l) - 'a'] + " p: ");
                    // System.out.println(freqP[s.charAt(l) - 'a']);
                    freqS[s.charAt(l++) - 'a']--;
                }
                // System.out.println();
                // System.out.println("end");
                // System.out.println();
                if (r - l + 1 < minLen) {
                    si = l;
                    ei = r;
                    minLen = r - l + 1;
                }
            }
        }

        if (si == -1) {
            return "-1";
        }
        return s.substring(si, ei + 1);
    }

    public static void main(String[] args) {
        smallestWindow("testtopractice", "toc");
    }

    /*
     * sol2 (leetcode)
     */
    public String minWindow(String s, String t) {
        int freq[] = new int[128];
        int n = s.length(), required = t.length();
        int si = -1, ei = -1, l = 0;
        int minLen = Integer.MAX_VALUE;

        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        for (int r = 0; r < n; r++) {
            if (freq[s.charAt(r)] > 0) {
                required--;
            }
            freq[s.charAt(r)]--;
            while (required == 0) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    si = l;
                    ei = r;
                }
                if (freq[s.charAt(l)] == 0) {
                    required++;
                }
                freq[s.charAt(l)]++;
                l++;
            }
        }
        return si == -1 ? "" : s.substring(si, ei + 1);
    }

    // both of the solutions uses sliding window but with slightly different logic.
    // both problems on geeks for geeks and leetcode are exactly same.
}
