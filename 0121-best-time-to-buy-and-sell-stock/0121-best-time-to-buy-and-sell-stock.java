class Solution {
    public int maxProfit(int[] prices) { 
        int minimum = Integer.MAX_VALUE;
        int maxpro = 0;
        int sell = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minimum){
                minimum = prices[i];
            }
            sell = prices[i] - minimum;
            if(maxpro < sell){
                maxpro = sell;
            }
        }
        return maxpro;
    }
        
    }