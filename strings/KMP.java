package strings;

public class KMP {

    public static void computeLPSArray(String p, int m, int[] lps) {
        int l = 0;
        int r = 1;

        // !calculating the table of pattern
        while (r < m) { // this logic is same as used in longest happy prefix question's sol1
            if (p.charAt(l) == p.charAt(r)) {
                lps[r++] = ++l;
            } else if (l > 0) {
                l = lps[l - 1];
            } else {
                r++;
            }
        }
    }

    public static void kmpAlgo(String s, String p) {
        int n = s.length();
        int m = p.length();
        int[] lps = new int[m];

        computeLPSArray(p, m, lps);

        int i = 0; // for txt
        int j = 0; // for pat
        while ((n - i) >= (m - j)) { // checking remaining elements to ensure string has enough elements
            if (s.charAt(i) == p.charAt(j)) { // if match
                i++;
                j++;
            } else if (j != 0) { // didn't match but j is greater than 0
                j = lps[j - 1];
            } else { // didn't match and j is also 0
                i++;
            }
            if (j == m) { // checking if the pattern is found
                System.out.println("Pattern found on idx: " + (i - j));
                j = lps[j - 1];
            }
        }
    }

    public static void main(String[] args) {
        kmpAlgo("abcdef", "cd"); // 2
    }
}
