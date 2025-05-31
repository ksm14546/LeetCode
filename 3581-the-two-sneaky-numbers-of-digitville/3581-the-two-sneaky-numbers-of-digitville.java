class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int []arr = new int [nums.length];
        for(int x : nums)
            arr[x]++;
        int [] res = new int[2];
        int ind=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==2)
                res[ind++]=i;
        }
        return res;
    }
}