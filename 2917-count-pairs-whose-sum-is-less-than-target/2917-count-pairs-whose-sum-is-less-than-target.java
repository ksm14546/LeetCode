class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int i,j,c=0;
        for(i=0;i<nums.size()-1;i++)
        {   
            for(j=i+1;j<nums.size();j++)
            {
                if(nums.get(i)+nums.get(j)<target)
                    c++;
            }
        }
        return c;

    }
}