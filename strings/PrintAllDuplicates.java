/*
 * geeks for geeks - Print all the duplicate characters in a string
 */

package strings;

import java.util.*;

public class PrintAllDuplicates {
    public static void printDuplicates(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> mapElement : map.entrySet()) {
            if (mapElement.getValue() > 1) {
                System.out.print("key: ");
                System.out.print(mapElement.getKey());
                System.out.print(" count: ");
                System.out.println(mapElement.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String s = "test string";
        printDuplicates(s);
    }
}
