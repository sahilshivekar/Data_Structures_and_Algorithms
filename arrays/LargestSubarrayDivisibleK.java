/*
 * geeks for geeks - Longest subarray with sum divisible by K
 */
package arrays;

import java.util.*;

public class LargestSubarrayDivisibleK {
    public static int sol(int arr[], int n, int k) {
        {
            Map<Integer, Integer> map = new HashMap<>();

            int maxLen = 0;
            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum += arr[i];
                int rem = sum % k;

                if (rem == 0) {
                    maxLen = i + 1;
                } else if (rem < 0) {
                    rem += k;
                }
                if (!map.containsKey(rem)) {
                    map.put(rem, i);
                } else {
                    maxLen = Math.max(maxLen, i - map.get(rem));
                }
            }

            return maxLen;
        }
    }

    public static void main(String[] args) {
        int[] arr = { -2, 2, -5, 12, -11, -1, 7 };
        int k = 3;
        int n = arr.length;
        System.out.println(sol(arr, n, k));
    }
}
