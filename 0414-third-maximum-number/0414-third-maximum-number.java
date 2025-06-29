class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer>s = new HashSet<>();
        for(int x : nums)
        {
            s.add(x);
        }
        if(s.size()<3)
        return Collections.max(s);
        else{
        s.remove(Collections.max(s));
        s.remove(Collections.max(s));
        
        // Return third max
        return Collections.max(s);
        }
    }
}