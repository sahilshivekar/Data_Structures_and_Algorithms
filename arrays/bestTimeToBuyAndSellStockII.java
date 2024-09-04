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

    /*
     * this solution is more optimized as its only incrementing i when the next
     * number is lesser it saves time of assigning values to the buy variable
     * 
     * time: O(n)
     * space: O(1)
     */
    public int maxProfit2(int[] prices) {
        int buy = prices[0], profit = 0, sell, n = prices.length - 1, i = 0;
        while (i < n) {
            while (i < n && prices[i + 1] <= prices[i])
                i++;
            buy = prices[i];
            while (i < n && prices[i + 1] > prices[i])
                i++;
            sell = prices[i];
            profit += sell - buy;
        }
        return profit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }
}
