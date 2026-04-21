class Solution {
    public int maxProfit(int[] prices) {
        int b = 0;
        int s = 1;
        int max = 0;
        int profit = 0;
        while(b<prices.length-1 && s>b){
            profit = prices[s]-prices[b];
            System.out.println(profit);
            if(max<profit){
                max = profit;
            }
            if(prices[b]>prices[s]){
                b = s;
                s = b+1;
            }else if(s==prices.length-1){
                b++;
                s = b+1;
            }else{
                s++;
            }
        }
        return max;
    }
}
