/*
 * Boyer Moore algo of string matching
 */

package strings;

import java.util.*;

public class BoyerMoore {
    static int noOfChars = 256;

    public static void badCharHeuristic(char[] pat, int m, int badChar[]) {

        Arrays.fill(badChar, -1);

        for (int i = 0; i < m; i++) {
            badChar[pat[i]] = i;
        }
    }

    public static void search(char txt[], char pat[]) {
        int n = txt.length;
        int m = pat.length;

        int badChar[] = new int[noOfChars];

        badCharHeuristic(pat, m, badChar);

        int s = 0; // shift of the pattern with respect to text

        while (s <= (n - m)) {
            int j = m - 1; // last index of pat to start comparing

            while (j >= 0 && pat[j] == txt[s + j]) { // s + j gives the correct idx to start comparing in txt
                j--;
            }

            if (j < 0) { // means pattern is matched
                System.out.println("Pattern is found on index: " + s);

                s += (s + m < n) ? m - badChar[s + m] : 1;
                // is s + m is out of bounds then we can't access badChar[s + m]
            } else {
                if(badChar[txt[s + j]] == -1){
                    System.out.println("here for char : " + txt[s + j] + " idx: " + (s + j));
                    s += j + 1;
                    System.out.println("s is now: " + s);
                    System.out.println();
                } else {
                    s += Math.max(1, j - badChar[txt[s + j]]);
                }
            }

        }
    }

    public static void main(String[] args) {
        char txt[] = "ABAAABCD".toCharArray();
        char pat[] = "ABC".toCharArray();
        search(txt, pat);
    }
}
