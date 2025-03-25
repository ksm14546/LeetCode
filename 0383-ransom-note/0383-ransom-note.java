class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (char c : ransomNote.toCharArray()) 
            ++arr[c - 'a'];
        for (int c : magazine.toCharArray()) 
            --arr[c - 'a'];
        for (int i = 0; i < 26; ++i) {
            if (arr[i] > 0) return false;
        }
        return true;
    }
}
