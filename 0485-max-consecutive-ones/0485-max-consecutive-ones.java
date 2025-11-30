class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mc=0,cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
                cnt++;
            if(nums[i]==0)
            {
                mc=Math.max(cnt,mc);
                cnt=0;
            }
        }
        return Math.max(mc,cnt);
    }
}