package recursion;

public class removeDuplicatesInString {
    public static void sol(String s, int n, StringBuilder newStr, boolean[] map) {
        if (n < s.length()) {
            int idx = s.charAt(n) - 'a';
            if (map[idx] == false) {
                map[idx] = true;
                newStr.append(s.charAt(n));
            }
            sol(s, n + 1, newStr, map);
        } else {
            System.err.println(newStr);
        }
    }

    public static void main(String[] args) {
        String s = "sahsaahiil";
        sol(s, 0, new StringBuilder(""), new boolean[26]);
    }
}
