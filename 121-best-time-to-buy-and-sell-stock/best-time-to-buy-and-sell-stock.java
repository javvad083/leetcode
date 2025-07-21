class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=Integer.MAX_VALUE;
        int n=prices.length;
        for(int i=0;i<n;i++){
            int cost=prices[i]-min;
            max=Math.max(max,cost);
            min=Math.min(min,prices[i]);
        }
        return max;
    }
}