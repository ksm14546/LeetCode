class Solution {
    public int maxSubArray(int[] nums) {
        int msum=Integer.MIN_VALUE,csum=0;
        for(int i=0;i<nums.length;i++)
        {
            csum+=nums[i];
            if(csum>msum)
            msum=csum;
            if(csum<0)
            csum=0;
        }
        return msum;
    }
}