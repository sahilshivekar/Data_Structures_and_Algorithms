/*
 * leetcode: 49. Group Anagrams
 */

package strings;

import java.util.*;

public class GroupAnagrams {

    /*
     * time: O(m*nlogn) m is len of strs and n is average len of string
     * space: O(m*n)
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] charArr = word.toCharArray();
            Arrays.sort(charArr);
            String sortedWord = new String(charArr);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
