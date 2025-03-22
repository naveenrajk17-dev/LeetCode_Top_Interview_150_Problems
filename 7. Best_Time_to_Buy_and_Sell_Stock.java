class Profit {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int maxProfit = 0;
        int buy = prices[0];

        for (int i = 1; i < prices.length; i++) {
            buy = Math.min(buy, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - buy);
        }

        return maxProfit;
    }

     public static void main(String[] args) {
         Profit sol = new Profit();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(sol.maxProfit(prices1)); // Output: 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println(sol.maxProfit(prices2)); // Output: 0

        int[] prices3 = {1, 2, 3, 4, 5};
        System.out.println(sol.maxProfit(prices3)); // Output: 4
    }
}
