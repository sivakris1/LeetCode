class Solution {
    public int maxProfit(int[] prices) {
        
        int left = 0;
        int profit = 0;

        //right always moves and left moves only when voilation came
        for(int right=1; right<prices.length; right++){
            if(prices[left] < prices[right]){
                int currentPrice = prices[right]-prices[left];
                profit = Math.max(currentPrice,profit);
            }
            else{
                //directly move left to right because buy should be lesser than sell
                left = right;
            }
        }

        return profit;
    }
}