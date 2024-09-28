/*
 * geeks for geeks - Print all combinations | Set-1
 * 
 * leetcode: 77. Combinations
 */

package arrays;

import java.util.ArrayList;
import java.util.List;

public class PrintAllCombinationsSet1 {

    /*
     * sol 1 using recursion inside loop
     */
    public void combUtil1(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
        if (k == 0) {
            combs.add(new ArrayList<>(comb));
            return;
        }
        for (int i = start; i <= n; i++) {
            comb.add(i);
            combUtil1(combs, comb, i + 1, n, k - 1);
            comb.remove(comb.size() - 1);
        }
    }

    public List<List<Integer>> combine1(int n, int k) {
        List<List<Integer>> combs = new ArrayList<>();
        combUtil1(combs, new ArrayList<Integer>(), 1, n, k);
        return combs;
    }

    /*
     * sol 2 using while loop
     */
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combs = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            comb.add(0);
        }
        int i = 0;
        while (i >= 0) {
            comb.set(i, comb.get(i) + 1);

            if (comb.get(i) > n) {
                i--;
            } else if (i == k - 1) {
                combs.add(new ArrayList<>(comb));
            } else {
                i++;
                comb.set(i, comb.get(i - 1));
            }
        }
        return combs;
    }
}
