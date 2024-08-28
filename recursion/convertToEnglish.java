/*
 * problem is not from leetcode
 * 
 * Problem statement: You are given a number (eg - 2019), convert it into a String of english like
 * “two zero one nine”. Use a recursive function to solve this problem.
 * NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
 * can’t be 0.
 * Sample Input : 1947
 * Sample Output : “one nine four seven”
 */
package recursion;

public class convertToEnglish {
    private static String[] words = {
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine"
    };

    public static void sol(int num) {
        if (num == 0) {
            return;
        }
        int lastDigit = num % 10; // 10%2019 = 9
        sol(num / 10); // 10*201 = 2010
        System.out.print(words[lastDigit] + " ");
    }

    public static void main(String[] args) {
        int num = 2019;
        sol(num);
    }
}
