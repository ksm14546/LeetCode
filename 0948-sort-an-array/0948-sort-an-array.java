class Solution {
    private static void merge(int[] nums, int low, int mid, int high)
    {
        int n1=mid-low+1;
        int n2=high-mid;
        int[] larr = new int[n1];
        int[] rarr = new int[n2];
        for(int x=0;x<n1;x++)
        {
            larr[x] = nums[low+x];
        }
        for(int y=0;y<n2;y++)
        {
            rarr[y]= nums[y+mid+1];
        }

        int i=0,j=0,k=low;

        while(i<n1 && j<n2)
        {
            if(larr[i]<=rarr[j])
            {
                nums[k]=larr[i];
                i++;
            }
            else if(larr[i]>rarr[j])
            {
                nums[k]=rarr[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            nums[k]=larr[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            nums[k]=rarr[j];
            j++;
            k++;
        }
    }
    private void mergesort(int[] nums, int low, int high)
    {   if(low<high)
        {
        int mid = (high-low)/2 + low;
        mergesort(nums,low,mid);
        mergesort(nums,mid+1,high);
        merge(nums,low,mid,high);
        }
    }

    public int[] sortArray(int[] nums) {
        int n=nums.length-1;
        mergesort(nums,0,n);
        return nums;
    }
}