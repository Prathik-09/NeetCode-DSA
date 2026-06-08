class Solution {
    public int maxProfit(int[] prices) {
        
        int mini=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(mini>prices[i]){
                mini=prices[i];
            }
            profit=Math.max(prices[i]-mini,profit);
        }
        return profit;
    }
}
