// Last updated: 4/22/2026, 9:08:45 PM
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minPrice = Integer.MAX_VALUE;
        int n = prices.length;
        for(int i = 0;i<n;i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }

            if(max < prices[i] - minPrice){
                max = prices[i] - minPrice;
            }
            
        }
        return max;
    }
}