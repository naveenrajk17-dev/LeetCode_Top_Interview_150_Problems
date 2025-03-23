class MaxProfit {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                maxProfit += prices[i + 1] - prices[i]; // Add profit from every upward transaction
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfit solution = new MaxProfit();

        // Test cases
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + solution.maxProfit(prices1)); // Output: 7

        int[] prices2 = {1, 2, 3, 4, 5};
        System.out.println("Max Profit: " + solution.maxProfit(prices2)); // Output: 4

        int[] prices3 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit: " + solution.maxProfit(prices3)); // Output: 0

        int[] prices4 = {1, 7, 2, 3, 6, 7, 6, 8};
        System.out.println("Max Profit: " + solution.maxProfit(prices4)); // Output: 10
    }
}
