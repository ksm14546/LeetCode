class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,h=nums.length-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(target==nums[mid])
                return mid;
            else if (target>nums[mid])
                l=mid+1;
            else 
                h=mid-1;
        }
        return l;
    }
}