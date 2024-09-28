/*
 * MO’s Algorithm (Query Square Root Decomposition) | Set 1 (Introduction)
 */

package arrays;

import java.util.*;

class Query {
    int l;
    int r;

    Query(int l, int r) {
        this.l = l;
        this.r = r;
    }
}

public class QuerySqrtDecomposition {
    public static void queryResults(int[] arr, int n, List<Query> q, int m) {
        int block = (int) Math.sqrt(n);
        
        Collections.sort(q, new Comparator<Query>() {
            public int compare(Query x, Query y) {
                if (x.l / block == y.l / block) 
                    return (x.r < y.r ? -1 : 1);
                return (x.l < y.l ? -1 : 1);
            }
        });

        int currL = 0, currR = 0, currSum = 0;

        for (int i = 0; i < m; i++) {

            int l = q.get(i).l, r = q.get(i).r;

            while (currL < l) {
                currSum -= arr[currL];
                currL++;
            }
            while (currL > l) {
                currSum += arr[currL];
                currL--;
            }
            while (currR <= r) {
                currSum += arr[currR];
                currR++;
            }
            while (currR > r + 1) {
                currSum -= arr[currR - 1];
                currR--;
            }
            System.out.println("Sum of [ " + l + ", " + r + " ] is " + currSum);
        }
    }

    public static void main(String[] args) {
        List<Query> q = new ArrayList<>();
        q.add(new Query(0, 4));
        q.add(new Query(1, 3));
        q.add(new Query(2, 4));
        for (Query i : q) {
            System.out.println(i.l + " " + i.r);
        }
        System.out.println();
        int[] arr = { 1, 1, 2, 1, 3, 4, 5, 2, 8 };
        int n = arr.length;
        int m = q.size();
        queryResults(arr, n, q, m);
    }
}

/*
 * Understanding the Purpose:
 * 
 * The comparator's goal is to sort query ranges first by their block number and
 * then by their right endpoint (R value) within each block. This is crucial for
 * optimizing query handling in MO's Algorithm.
 * Block Division:
 * 
 * The expression x.L / block calculates which block a query’s left endpoint (L)
 * belongs to. The variable block is typically the square root of the total
 * number of elements (array size). This division groups queries into blocks.
 * If x.L is 0 to 3 and y.L is 4 to 7 in a block size of 4, x.L / block gives 0,
 * and y.L / block gives 1. This helps in determining which block the queries
 * belong to.
 * Comparison Logic:
 * 
 * if (x.L / block != y.L / block) checks if the two queries belong to different
 * blocks. If they do, it returns the result based on which block is smaller.
 * If they belong to the same block, it falls back to comparing their right
 * endpoints with return (x.R < y.R ? -1 : 1). This ensures that within the same
 * block, queries are sorted by their end values.
 */