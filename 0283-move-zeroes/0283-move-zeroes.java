class Solution {
    public void moveZeroes(int[] nums) {
        int i,k=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                if(i!=k)
                {
                    int temp=nums[i];
                    nums[i]=nums[k];
                    nums[k]=temp;
                }
                k++;
            }
        }
    }
}