class Solution {
    public int maxProduct(int[] nums) {
        int mpr=Integer.MIN_VALUE,cpr=1;
        for(int i=0;i<nums.length;i++)
        {
            cpr*=nums[i];
            if(cpr>mpr)
            mpr=cpr;
            if(cpr==0)
            cpr=1;
        }
        cpr=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            cpr*=nums[i];
            if(cpr>mpr)
            mpr=cpr;
            if(cpr==0)
            cpr=1;
        }
        return mpr;  
    }
}