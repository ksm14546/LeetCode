class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0,end=0,maxlength=0;
        List<Character> res = new ArrayList<Character>();
        while(end<s.length())
        {
            if(!res.contains(s.charAt(end)))
            {
            res.add(s.charAt(end));
            end++;
            maxlength=Math.max(maxlength,res.size());
             }
             else
            {
            res.remove(Character.valueOf(s.charAt(start)));
            start++;
            }
        }
        return maxlength;
    }
}