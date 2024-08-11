/*
 * leetcode: 242. Valid Anagram
 */
package strings;

public class validAnagram {
    /*
     * time: O(n)
     * space: O(26)
     */
    public static boolean isAnagram(String s, String t) {
        int count[] = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }

        for (int i : count) {
            if (i != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";
        System.out.println(isAnagram(str1, str2));
    }
}