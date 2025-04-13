class Solution {

    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int j = nums.length - 1, i = 0;
        while (i < j) {
            if (nums[i] == -nums[j]) return nums[j]; else if (nums[i] < -nums[j]) i++; else j--;
        }
        return -1;
    }
}
