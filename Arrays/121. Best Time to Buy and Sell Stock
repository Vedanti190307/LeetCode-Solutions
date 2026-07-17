class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxP=0;
        int minPrice=prices[0];
        for(int i=0;i<n;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            int profit=prices[i]-minPrice;
            if(profit>maxP){
                maxP=profit;
            }
        }
        return maxP;
    }
}