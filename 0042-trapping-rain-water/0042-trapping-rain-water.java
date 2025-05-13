class Solution {
    public int trap(int[] height) {
        int n=height.length,res=0;
        int left[] = new int[n];
        int right[] = new int[n];
        int max=-1;
        for(int i=0;i<n;i++)
        {   if(height[i]>=max)
                max=height[i];
            left[i]=max;
        }
        max=-1;
        for(int i=n-1;i>=0;i--)
        {
            if(height[i]>=max)
                max=height[i];
            right[i]=max;
        }
        for(int i=0;i<n;i++)
        {
            res+=Math.min(left[i],right[i])-height[i];
        }
        return res;
    }
}