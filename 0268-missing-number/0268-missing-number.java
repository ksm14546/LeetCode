class Solution {

    public int missingNumber(int[] nums) {
        int n = nums.length, sum = 0, tot = 0;
        tot = n * (n + 1) / 2;
        for (int x : nums) sum += x;
        return tot - sum;
    }
}
