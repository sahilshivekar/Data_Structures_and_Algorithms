/*
 * Transform One String to Another using Minimum Number of Given Operation
 */

package strings;

public class TransfromAtoBinMinOperation {
    public static int transform(String a, String b) {
        int NO_OF_CHARS = 256;
        int n = a.length();
        int m = b.length();
        int res = 0;
        int freq[] = new int[NO_OF_CHARS];

        for (int i = 0; i < n; i++) {
            freq[a.charAt(i)]++;
        }

        for (int i = 0; i < m; i++) {
            freq[b.charAt(i)]--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return -1;
            }
        }

        int ai = n - 1, bi = m - 1;
        while (ai >= 0) {
            if (a.charAt(ai) != b.charAt(bi)) {
                res++;
                ai--;
            } else {
                ai--;
                bi--;
            }
        }

        return res;
    }
}
