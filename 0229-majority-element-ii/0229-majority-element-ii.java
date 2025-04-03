class Solution {
    public List<Integer> majorityElement(int[] nums) {  
        Map<Integer, Integer> mp = new HashMap<>();
        HashSet<Integer> se = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for (int x : nums) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
            if (mp.get(x) > nums.length / 3) se.add(x);
        }
        for(int y : se)
            res.add(y);
        return res;
    }
}