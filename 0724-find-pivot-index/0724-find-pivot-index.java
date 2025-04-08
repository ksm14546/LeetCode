class Solution {

    public int pivotIndex(int[] nums) {
        int s1 = 0, s2 = 0;
        for (int x : nums) {
            s1 += x;
        }
        for (int i = 0; i < nums.length; i++) {
            s1 -= nums[i];
            if (s1 == s2) return i;
            s2 += nums[i];
        }
        return -1;
    }
}
