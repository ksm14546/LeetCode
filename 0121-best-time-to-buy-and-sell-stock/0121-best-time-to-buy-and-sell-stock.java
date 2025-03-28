class Solution {
    public int maxProfit(int[] prices) {
        int minp = Integer.MAX_VALUE;
        int maxp=0;
        for(int x : prices)
        {
            minp = Math.min(x,minp);
            maxp = Math.max(maxp,x-minp);
        }
        return maxp;
    }
}