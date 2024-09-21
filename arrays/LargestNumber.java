/*
 * leetcode 179. Largest Number
 * 
 * geeks for geeks - Given an Array of Numbers Arrange the Numbers to Form the Biggest Number
 */
package arrays;

import java.util.*;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        List<String> arr = new ArrayList<>();
        for (int n : nums) {
            arr.add(Integer.toString(n));
        }
        Collections.sort(arr, (a, b) -> (b + a).compareTo(a + b)); // return 1 is (b+a) is larger than (a+b)
        StringBuilder res = new StringBuilder();
        for (String s : arr) {
            res.append(s);
        }
        if (res.charAt(0) == '0') {
            return "0";
        }
        return res.toString();
    }
}