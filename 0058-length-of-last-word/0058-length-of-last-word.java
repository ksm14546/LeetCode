class Solution {
    public int lengthOfLastWord(String s) {
        int cnt=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
                cnt++;
            else {
                if(cnt>0)
                return cnt;
            }
        }
        return cnt;
    }
}