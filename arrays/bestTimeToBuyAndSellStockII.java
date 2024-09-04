/*
 * leetcode: 122. Best Time to Buy and Sell Stock II
 */
package arrays;

public class bestTimeToBuyAndSellStockII {
    /*
     * time: O(n)
     * space: O(1)
     */
    public static int maxProfit(int[] a) {
        int buy = a[0];
        int profit = 0;
        for (int i = 1; i < a.length; i++) {
            if (buy < a[i]) {
                profit += a[i] - buy;
            }
            buy = a[i];
        }
        return profit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }
}
