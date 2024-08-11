/*
 * leetcode: 443. String Compression
 */
package strings;

public class stringCompression {

    /*
     * time: O(n)
     * space: O(1)
     */
    public static int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int store = 0;
        while (i < n) {
            char curChar = chars[i];
            int count = 0;
            while (i < n && curChar == chars[i]) {
                i++;
                count++;
            }
            chars[store++] = curChar;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[store++] = c;
                }
            }
        }
        return store;
    }

    public static void main(String[] args) {
        char chars[] = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        System.out.println(compress(chars));
    }
}
