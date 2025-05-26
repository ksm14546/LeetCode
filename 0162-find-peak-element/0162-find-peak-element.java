class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1)
            return 0;
        if(nums[0]>nums[1])
            return 0;
        if(nums[n-1]>nums[n-2])
            return n-1;
        int first=1,last=n-2;
        while(first<=last)
        {
            int mid= first + (last-first)/2;
            if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1])
                return mid;
            else if(nums[mid]<nums[mid-1])
                last = mid-1;
            else if(nums[mid]<nums[mid+1])
                first=mid+1;
        }
    return -1;
        
    }
}