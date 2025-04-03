class Solution {
    public int largestAltitude(int[] gain) {
        int ma=0,x=0;
        for(int i : gain)
        {
            x+=i;
            ma=Math.max(ma,x);
        }
        return ma;
    }
}