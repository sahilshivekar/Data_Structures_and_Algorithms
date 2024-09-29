/*
 * geeks for geeks -  Convert a sentence into its equivalent mobile numeric keypad sequence
 */

package strings;

public class SentenceToMobileNumericKeypad {

    public static String printInNumeric(String input, String[] s) {
        int n = input.length();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (input.charAt(i) == ' ') {
                ans.append('0');
            } else {
                int idx = input.charAt(i) - 'A';
                ans.append(s[idx]);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[] s = {
                "2", "22", "222", "3", "33", "333",
                "4", "44", "444", "5", "55", "555",
                "6", "66", "666", "7", "77", "777",
                "7777", "8", "88", "888", "9", "99",
                "999", "9999"
        };
        String input = "GEEKSFORGEEKS";
        System.out.println(printInNumeric(input, s));
    }
}
