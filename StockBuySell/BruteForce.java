class Solution {
    public int maxProfit(int[] prices) {
        //brute force time limit exceeded
        int min = Integer.MAX_VALUE, maxprofit = 0, idx = prices.length-1, profit = 0;
        for(int i=0;i<prices.length-1; i++) { 
            for(int j = i+1; j<prices.length; j++) {
                if((prices[i]<prices[j]) && ((prices[j]-prices[i])>maxprofit)) {
                    maxprofit = prices[j]-prices[i];
                }
            }
        }
        return maxprofit;
    }
}
