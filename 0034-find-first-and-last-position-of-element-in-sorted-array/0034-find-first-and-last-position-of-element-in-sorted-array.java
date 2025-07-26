class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = {-1,-1};
        if(nums.length==0)
            return res;
        res[0] = findfirst(nums,target);
        res[1] = findlast(nums,target);

        return res;
    }

    private static int findfirst(int[] nums,int target)
    {
        int l=0,r=nums.length-1;
        int fp = -1;
        while(l<=r)
        {
            int mid = l + (r-l)/2;
            if(target == nums[mid])
            {
                fp = mid;
                r = mid-1;
            }
            else if(target > nums[mid])
                l=mid+1;
            else
                r=mid-1;
        }
        return fp;
    }

    private static int findlast(int[] nums,int target)
    {
        int l=0,r=nums.length-1;
        int lp = -1;
        while(l<=r)
        {
            int mid = l+(r-l)/2;
            if(target == nums[mid])
            {
                lp = mid;
                l = mid+1;
            }
            else if(target > nums[mid])
                l=mid+1;
            else
                r=mid-1;
        }
        return lp;
    }
}