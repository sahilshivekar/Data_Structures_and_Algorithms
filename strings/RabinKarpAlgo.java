/*
 * rabin karp algorithm 
 */
package strings;

import java.util.*;

public class RabinKarpAlgo {
    public static List<Integer> search(String str, String pat) {
        long p = 101; // or 31 but a prime number greater than the limit of character
        long pow = p;
        long mod = 1000000007; // the bigger the prime number the lesser the collision

        int n = str.length();
        int m = pat.length();

        long hPat = pat.charAt(0);
        for (int i = 1; i < m; i++) {
            hPat = (hPat + (pat.charAt(i) * pow) % mod) % mod;
            pow = (pow * p) % mod;
        }

        long[] hStr = new long[n];
        long[] pows = new long[n];

        pow = p;
        pows[0] = 1;
        hStr[0] = str.charAt(0);
        for (int i = 1; i < n; i++) {
            hStr[i] = (hStr[i - 1] + (str.charAt(i) * pow) % mod) % mod;
            pows[i] = pow;
            pow = (pow * p) % mod;
        }
        // System.out.println(hStr[n - 1]);

        int sp = 0, ep = m - 1;
        List<Integer> ans = new ArrayList<>();
        while (ep < n) {
            long win = hStr[ep];
            if (sp > 0) {
                win = (win - hStr[sp - 1] + mod) % mod;
            }
            if (win == (hPat * pows[sp]) % mod) {
                int i;
                for (i = sp; i < ep; i++) {
                    if (pat.charAt(i - sp) != str.charAt(i)) {
                        System.out.println("collision");
                        break;
                    }
                }
                if (i == ep) {
                    ans.add(sp);
                }
            }
            sp++;
            ep++;
        }

        return ans;
    }

    public static void main(String[] args) {
        List<Integer> ans = search("aabfgrgewskkkfhsdfdn", "fhs");
        // System.out.println("here");
        System.out.println("size: " + ans.size());
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
