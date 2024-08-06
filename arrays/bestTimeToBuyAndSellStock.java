/*
* leetcode: 121. Best Time to Buy and Sell Stock
*/
package arrays;

public class bestTimeToBuyAndSellStock {

    /*
     * time: O(n)
     * space: O(1)
     */
    public static int maxProfit(int[] prices) {
        int maxProfit = 0, buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (buy < prices[i]) {
                maxProfit = Math.max(maxProfit, prices[i] - buy);
            } else {
                buy = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }

}